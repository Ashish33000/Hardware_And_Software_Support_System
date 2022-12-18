package com.project.usecase;

import java.util.List;

import com.project.dao.EmployeeDao;
import com.project.dao.EmployeeDaoImpl;
import com.project.exception.ProblemException;
import com.project.model.Problem;

public class EmploySeeAllProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			List<Problem> problem=dao.seeAllProblem();
			problem.forEach(pro->{
				System.out.println("Problem id is: "+pro.getPid());
				System.out.println("Problem  is: "+pro.getProblem());
				System.out.println("Problem Status is: "+pro.getStatus());
				System.out.println("Problem cid is: "+pro.getCid());
				System.out.println("Problem Engineer name is: "+pro.getEname());
				System.out.println("==========================================");
				
			});
		} catch (ProblemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
