package com.project.usecase;

import java.util.Scanner;

import com.project.dao.HodDao;
import com.project.dao.HodDaoImpl;
import com.project.exception.ProblemException;
import com.project.model.Problem;

public class AssignProblemToEngineerUseCase {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);		
		System.out.println("Enter Problem");
		String problem=sc.next();
		System.out.println("Enter status");
		String status=sc.next();
		System.out.println("Enter Engineer Name");
		String ename=sc.next();
		
		HodDao dao=new HodDaoImpl();
		Problem problems=new Problem();
		problems.setProblem(problem);
		problems.setStatus(status);
		problems.setEname(ename);
		
	
		try {
			String result=dao.AsignProblemToEngineer(problems);
			System.out.println(result);
		} catch (ProblemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
