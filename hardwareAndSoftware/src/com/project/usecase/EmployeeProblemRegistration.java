package com.project.usecase;

import java.util.Scanner;

import com.project.dao.EmployeeDao;
import com.project.dao.EmployeeDaoImpl;
import com.project.exception.ProblemException;
import com.project.model.Problem;

public class EmployeeProblemRegistration {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);		
			System.out.println("Enter Problem");
			String problem=sc.next();
			System.out.println("Enter status");
			String status=sc.next();
		
			
			EmployeeDao dao=new EmployeeDaoImpl();
			Problem problems=new Problem();
			problems.setProblem(problem);
			problems.setStatus(status);
			
			
		
			try {
				String result=dao.registerProblem(problems);
				System.out.println(result);
			} catch (ProblemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}

	}


