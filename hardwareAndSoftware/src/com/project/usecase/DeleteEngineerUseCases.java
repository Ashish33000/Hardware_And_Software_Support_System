package com.project.usecase;

import java.util.Scanner;

import com.project.dao.HodDao;
import com.project.dao.HodDaoImpl;
import com.project.exception.EngineerException;
import com.project.model.Engineer;

public class DeleteEngineerUseCases {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eid to delete");
		int eid=sc.nextInt();   
		HodDao dao=new HodDaoImpl();
	
		try {
			String result=dao.DeleteEngineer(eid);
			System.out.println(result);
		} catch (EngineerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
