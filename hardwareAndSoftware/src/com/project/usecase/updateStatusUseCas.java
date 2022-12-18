package com.project.usecase;

import java.util.Scanner;

import com.project.dao.EngineerDao;
import com.project.dao.EngineerDaoImpl;
import com.project.exception.ProblemException;

public class updateStatusUseCas {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		int pid=sc.nextInt();
		System.out.println("Enter to change status");
		String status=sc.next();
		EngineerDao dao=new EngineerDaoImpl();
		try {
			String result=dao.updateProblmStatus(pid, status);
			System.out.println(result);
		} catch (ProblemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
