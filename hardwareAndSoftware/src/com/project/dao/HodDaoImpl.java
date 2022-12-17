package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.exception.EngineerException;
import com.project.exception.HodException;
import com.project.exception.ProblemException;
import com.project.model.Engineer;
import com.project.model.Hod;
import com.project.model.Problem;
import com.project.utility.DBUtil;

public class HodDaoImpl implements HodDao {

	@Override
	public Hod loginHod(String username, String password) throws HodException {
		Hod hod=null;
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("select * from hod where email=? AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				hod=new Hod();
				hod.setHid(rs.getInt("hid"));
				hod.setName(rs.getString("name"));
				hod.setAddress(rs.getString("address"));
				hod.setEmail(rs.getString("email"));
				hod.setPassword(rs.getString("password"));
			}else {
				throw new HodException("Invalid username and password");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new HodException(e.getMessage());
		}
		return hod;
	}

	@Override
	public String registerEngineer(Engineer engineer) throws EngineerException {
		String message="Engineer Not Registered..........";
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("insert into engineer (name,address,email,password,category) values(?,?,?,?,?)");
			ps.setString(1, engineer.getName());
			ps.setString(2, engineer.getAddress());
			ps.setString(3, engineer.getEmail());
			ps.setString(4, engineer.getPassword());
			ps.setString(5, engineer.getCategory());
			int x=ps.executeUpdate();
			if(x>0) {
				message="Engineer Registered Sucessfully......";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		  throw new EngineerException(e.getMessage());
		}
	
		return message;
	}

	@Override
	public List<Engineer> getAllEngineerDetails() throws EngineerException {
		List<Engineer> engineer=new ArrayList<>();
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("select * from engineer");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int i=rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				String e=rs.getString("email");
				String p=rs.getString("password");
				String c=rs.getString("category");
				Engineer engineer1=new Engineer();
				engineer1.setEid(i);
				engineer1.setName(n);
				engineer1.setAddress(a);
				engineer1.setEmail(e);
				engineer1.setPassword(p);
				engineer1.setCategory(c);
				engineer.add(engineer1);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new EngineerException(e.getMessage());
		}
		return engineer;
	}

	@Override
	public String DeleteEngineer(int eid) throws EngineerException {
		String message="Engineer Department not deleted....";
		try(Connection conn=DBUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("delete from engineer where eid=?");
			ps.setInt(1, eid);
			int x=ps.executeUpdate();
			if(x>0) {
				message="Department Deleted Sucessfully....";
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new EngineerException(e.getMessage());
		}
		return message;
	}

	@Override
	public Problem AsignProblemToEngineer(String problem) throws ProblemException {
		// TODO Auto-generated method stub
		return null;
	}

}
