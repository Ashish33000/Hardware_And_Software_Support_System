package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.exception.EmployeeException;
import com.project.exception.EngineerException;
import com.project.exception.ProblemException;
import com.project.model.Employee;
import com.project.model.Engineer;
import com.project.model.Problem;
import com.project.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String registerEmployee(Employee employee) throws EmployeeException {
		String message="Employee registraion failed";
		try (Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into employee (name,address,email,password) values(?,?,?,?)");
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getAddess());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getPassword());
			int x=ps.executeUpdate();
			if(x>0) {
				message="Employee Registaraion Sucessfull....";
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new EmployeeException(e.getMessage());
		}
		
		return message;
	}

	@Override
	public Employee loginEmployee(String username, String password) throws EmployeeException {
		Employee emp=null;
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("select * from employee where email=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				emp=new Employee();
				emp.setEid(rs.getInt("eid"));
				emp.setName(rs.getString("name"));
				emp.setAddess(rs.getString("address"));
				emp.setEmail(rs.getString("email"));				
				emp.setPassword(rs.getString("password"));
			}else {
				throw new EmployeeException("Invalid Username and password");
			}
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		return emp;
	}

	@Override
	public String registerProblem(Problem problem) throws ProblemException {
		String message="Problem Not Registered......";
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("insert into problem(problem,status,cid) values(?,?,floor(1+rand()*300))");
			ps.setString(1, problem.getProblem());
			ps.setString(2, problem.getStatus());
			
			int x=ps.executeUpdate();
			if(x>0) {
				message="problem registered...........";
			}
		} catch (SQLException e) {
			// TODO: handle exception
			throw new ProblemException(e.getMessage());
		}
		
;		
		return message;
	}

	@Override
	public Problem statusOfProblemByProblemId(int pid) throws ProblemException {
		Problem problem=null;
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("select * from problem where pid=?");
			ps.setInt(1, pid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				problem=new Problem();
				problem.setPid(rs.getInt("pid"));
				problem.setStatus(rs.getString("status"));
			}
			
		} catch (SQLException e) {
			throw new ProblemException(e.getMessage());
		}
				
		return problem;
	}

	
	@Override
	public List<Problem> seeAllProblem() throws ProblemException {
		List<Problem> problem=new ArrayList<>();
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("select * from problem");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int i=rs.getInt("pid");
				String p=rs.getString("problem");
				String s=rs.getString("status");
				int c=rs.getInt("cid");
				String e=rs.getString("ename");
			
				Problem prob=new Problem();
				prob.setPid(i);
				prob.setProblem(p);
				prob.setStatus(s);
				prob.setCid(c);
				prob.setEname(e);
				problem.add(prob);
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new ProblemException(e.getMessage());
		}
		return problem;
	}

	@Override
	public String changeEmployeePassword(String username,String password) throws EmployeeException {
		String message="password not changed..........";
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("update employee set password=? where email=?");
			ps.setString(1, password);
			ps.setString(2, username);
			int x=ps.executeUpdate();
			if(x>0) {
				message="password changed Sucessfully......";
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new EmployeeException(e.getMessage());
		}
		return message;
	}

}
