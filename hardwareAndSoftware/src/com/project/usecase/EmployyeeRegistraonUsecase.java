package com.project.usecase;

import java.util.Scanner;

import com.project.dao.EmployeeDao;
import com.project.dao.EmployeeDaoImpl;
import com.project.dao.HodDao;
import com.project.exception.EmployeeException;
import com.project.model.Employee;

public class EmployyeeRegistraonUsecase {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Address");
		String address=sc.next();
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter Password");
		String password=sc.next();
		
		
		EmployeeDao dao=new EmployeeDaoImpl();
		Employee emp=new Employee();
		emp.setName(name);
		emp.setAddess(address);
		emp.setEmail(email);
		emp.setPassword(password);
		
		try {
			String result=dao.registerEmployee(emp);
			System.out.println(result);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
