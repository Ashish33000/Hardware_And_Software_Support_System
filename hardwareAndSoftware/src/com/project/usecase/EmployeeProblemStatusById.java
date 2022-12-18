package com.project.usecase;

import java.util.Scanner;

import com.project.dao.EmployeeDao;
import com.project.dao.EmployeeDaoImpl;
import com.project.exception.ProblemException;
import com.project.model.Problem;

public class EmployeeProblemStatusById {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pId");
		int pid=sc.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
			Problem pro=dao.statusOfProblemByProblemId(pid);
			
			System.out.println("Status is: "+pro.getStatus());
		} catch (ProblemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
