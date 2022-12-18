package com.project.usecase;

import java.util.List;
import java.util.Scanner;

import com.project.dao.EngineerDao;
import com.project.dao.EngineerDaoImpl;
import com.project.exception.ProblemException;
import com.project.model.Problem;

public class AllProblemAttendedByEngineerUsecase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Enginner name to See All problem");
		String ename=sc.next();
		EngineerDao dao=new EngineerDaoImpl();
		
		try {
			List<Problem> problems=dao.AllProblemAttendedByEngineer(ename);
			problems.forEach(prob->{
				System.out.println("Problem Id is: "+prob.getPid());
				System.out.println("Problem  is: "+prob.getProblem());
				System.out.println("Problem Status is: "+prob.getStatus());
				System.out.println("Engineer Assign is: "+prob.getEname());
				System.out.println("Problem ComplainId is: "+prob.getCid());
			});
		} catch (ProblemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
