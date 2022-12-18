package com.project.Main;
import java.util.Scanner;

import com.project.usecase.*;
public class Hod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("==============Welcome TO Hod Department===============");
		System.out.println("\n");
		System.out.println("Enter 1 for HOD Login");
		System.out.println("Enter 2 for Register Engineer");
		System.out.println("Enter 3 for Get All Engineer Details");
		System.out.println("Enter 4 for Delete the Engineer from databases");
		System.out.println("Enter 5 for Assign Job To Engineer");
		
		int x=sc.nextInt();
		
		switch (x) {
		
		case 1:{
			HodloginUsecase.main(args);
			break;
		}
		case 2:{
			registerEngineerUseCases.main(args);
			break;
		}
		case 3:{
			GetAllEngineerDetailsUseCases.main(args);
			break;
		}
		case 4:{
			DeleteEngineerUseCases.main(args);
			break;
		}
		case 5:{
			AssignProblemToEngineerUseCase.main(args);
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
