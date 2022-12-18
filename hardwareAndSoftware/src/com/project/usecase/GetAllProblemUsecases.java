package com.project.usecase;

import java.util.List;

import com.project.dao.EngineerDao;
import com.project.dao.EngineerDaoImpl;
import com.project.exception.ProblemException;
import com.project.model.Problem;

public class GetAllProblemUsecases {

	public static void main(String[] args) {
		EngineerDao dao=new EngineerDaoImpl();
		
		try {
			List<Problem> problem=dao.getAllProblemDetails();
			problem.forEach(pro->{
				System.out.println("Problem id is: "+pro.getPid());
				System.out.println("Problem  is: "+pro.getProblem());
				System.out.println("Problem Status is: "+pro.getStatus());
				System.out.println("Problem Assigns to engineer is: "+pro.getEname());
				System.out.println("Problem complain id is: "+pro.getCid());
				System.out.println("==========================================");
			});
		} catch (ProblemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

} 
