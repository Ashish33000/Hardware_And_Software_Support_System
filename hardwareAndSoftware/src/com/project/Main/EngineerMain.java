package com.project.Main;

import java.util.Scanner;
import com.project.usecase.*;
public class EngineerMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("==============Welcome TO Engineering Department===============");
		System.out.println("\n");
		System.out.println("Enter 1 for Engineer Login");
		System.out.println("Enter 2 for Get All Problem Details");		
		System.out.println("Enter 3 for Update problem Status");
		System.out.println("Enter 4 for Watching Problem List");
		System.out.println("Enter 5 for Changing Engineer Password");
		int x=sc.nextInt();
		
		switch (x) {
		
		case 1:{
			EngineerLoginUseCases.main(args);
			break;
		}
		case 2:{
			GetAllProblemUsecases.main(args);
			break;
		}
		case 3:{
			updateStatusUseCas.main(args);
			break;
		}
		case 4:{
			GetAllProblemUsecases.main(args);
			break;
		}
		case 5:{
			
			ChangeEngineerPaswordUseCase.main(args);
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
