package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.exception.EngineerException;
import com.project.exception.ProblemException;
import com.project.model.Engineer;
import com.project.model.Problem;
import com.project.utility.DBUtil;

public class EngineerDaoImpl implements EngineerDao {

	@Override
	public Engineer loginEngineer(String username, String password) throws EngineerException {
		Engineer eng=null;
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("select * from engineer where email=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				eng=new Engineer();
				eng.setEid(rs.getInt("eid"));
				eng.setName(rs.getString("name"));
				eng.setAddress(rs.getString("address"));
				eng.setEmail(rs.getString("email"));
				eng.setPassword(rs.getString("password"));
				eng.setCategory(rs.getString("category"));
			}else {
				throw new EngineerException("Invalid username and password");
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new EngineerException(e.getMessage());
		}
		return eng;
	}

	@Override
	public List<Problem> getAllProblemDetails() throws ProblemException {
		List<Problem> problem=new ArrayList<>();
		try (Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from problem");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int i=rs.getInt("pid");
				String p=rs.getString("problem");
				String s=rs.getString("status");
				String en=rs.getString("ename");
				int c=rs.getInt("cid");
				Problem problems=new Problem();
				problems.setPid(i);
				problems.setProblem(p);
				problems.setStatus(s);
				problems.setEname(en);
				problems.setCid(c);
				problem.add(problems);
			}
			
		} catch (SQLException e) {
			throw new ProblemException(e.getMessage());
		}
		return problem;
	}
@Override
	public String updateProblmStatus(int pid,String status) throws ProblemException {
		String message="Status not changed..";
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("update problem set status=? where pid=?");
			
			ps.setString(1, status);
			ps.setInt(2, pid);
			
			int x=ps.executeUpdate();
			if(x>0) {
				message="Staus is changed by engineer......";
			}
			
		} catch (SQLException e) {
			throw new ProblemException(e.getMessage());
		}
		return message;
	}

	@Override
	public List<Problem> AllProblemAttendedByEngineer(String ename) throws ProblemException {
		List<Problem> problemlist=new ArrayList<>();
		try (Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from problem where ename=?");
			ps.setString(1, ename);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int i=rs.getInt("pid");
				String p=rs.getString("problem");
				String s=rs.getString("status");
				String en=rs.getString("ename");
				int c=rs.getInt("cid");
				Problem problems=new Problem();
				problems.setPid(i);
				problems.setProblem(p);
				problems.setStatus(s);
				problems.setEname(en);
				problems.setCid(c);
				problemlist.add(problems);
				
			}
			if(problemlist.size()==0) {
				throw new ProblemException("Engineer not Assigns with given problem");
			}
				
			
			
		} catch (SQLException e) {
			throw new ProblemException(e.getMessage());
		}
		return problemlist;
	}
	

	@Override
	public String changepassword(String username,String password) throws EngineerException {
		String message="password not changed..........";
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("update engineer set password=? where email=?");
			ps.setString(1, password);
			ps.setString(2, username);
			int x=ps.executeUpdate();
			if(x>0) {
				message="password changed Sucessfully......";
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new EngineerException(e.getMessage());
		}
		return message;
	}

}
