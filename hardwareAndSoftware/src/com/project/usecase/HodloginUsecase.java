package com.project.usecase;

import java.util.Scanner;

import com.project.dao.HodDao;
import com.project.dao.HodDaoImpl;
import com.project.exception.HodException;
import com.project.model.Hod;

public class HodloginUsecase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String username=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		
		HodDao dao=new HodDaoImpl();
		try {
			Hod hod=dao.loginHod(username, password);
			System.out.println("Welcome HOD : "+hod.getName());
		} catch (HodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
