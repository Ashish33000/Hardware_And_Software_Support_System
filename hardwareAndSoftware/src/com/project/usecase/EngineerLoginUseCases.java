package com.project.usecase;

import java.util.Scanner;

import com.project.dao.EngineerDao;
import com.project.dao.EngineerDaoImpl;
import com.project.exception.EngineerException;
import com.project.model.Engineer;

public class EngineerLoginUseCases {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String username=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		
		EngineerDao dao=new EngineerDaoImpl();
		
		try {
			Engineer eng=dao.loginEngineer(username, password);
			System.out.println("Welcome Engineer: "+eng.getName());
		} catch (EngineerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
