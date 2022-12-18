
package com.project.usecase;

import java.util.Scanner;

import com.project.dao.EmployeeDao;
import com.project.dao.EmployeeDaoImpl;
import com.project.exception.EmployeeException;
import com.project.model.Employee;

public class EmployeeLoginUsecases {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String username=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
			Employee emp=dao.loginEmployee(username, password);
			System.out.println("Welcome Employee: "+emp.getName());
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
