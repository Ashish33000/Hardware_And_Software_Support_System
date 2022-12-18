package com.project.usecase;

import java.util.Scanner;

import com.project.dao.EmployeeDao;
import com.project.dao.EmployeeDaoImpl;

import com.project.exception.EngineerException;

public class EmployeeChangePassword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username to change Password");
		String username=sc.next();
		System.out.println("Enter password to change Password");
		String password=sc.next();
		
		 EmployeeDao dao=new EmployeeDaoImpl();
		 try {
			String result=dao.changeEmployeePassword(username, password);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
