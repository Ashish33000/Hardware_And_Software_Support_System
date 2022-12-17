package com.project.usecase;

import java.util.Scanner;

import com.project.dao.HodDao;
import com.project.dao.HodDaoImpl;
import com.project.exception.EngineerException;
import com.project.model.Engineer;

public class registerEmployeeUseCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Address");
		String address=sc.next();
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter Password");
		String password=sc.next();
		System.out.println("Enter  Category");
		String category=sc.next();
		
		HodDao dao=new HodDaoImpl();
		Engineer eng=new Engineer();
		eng.setName(name);
		eng.setAddress(address);
		eng.setEmail(email);
		eng.setPassword(password);
		eng.setCategory(category);
		
		
		try {
			String result=dao.registerEngineer(eng);
			System.out.println(result);
		} catch (EngineerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
