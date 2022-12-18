package com.project.Main;

import java.util.Scanner;
import com.project.usecase.*;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("==============Welcome TO Employee Department===============");
		System.out.println("\n");
		System.out.println("Enter 1 for Registrng as employee");
		System.out.println("Enter 2 for Employee Login");
		System.out.println("Enter 3 for Registring Problem");
		System.out.println("Enter 4 for for status of problem by problem id");
		System.out.println("Enter 5 for Watching List of All Problem");
		System.out.println("Enter 6 for changing the Employee Password");
		
		int x=sc.nextInt();
		
		switch (x) {
		case 1: {
			EmployyeeRegistraonUsecase.main(args);
			break;
		}
		case 2 :{
			EmployeeLoginUsecases.main(args);
			break;
		}
		case 3 :{
			EmployeeProblemRegistration.main(args);
			break;
		}
		case 4 :{
			EmployeeProblemStatusById.main(args);
			break;
		}
		
		case 5:{
			EmploySeeAllProblem.main(args);
			break;
		}
		case 6:{
			EmployeeChangePassword.main(args);
			break;
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

