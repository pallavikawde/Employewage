package empwagebuilder;

import java.util.Scanner;

public class Employe {
	public static void main(String[] args) {
		System.out.println("Welcome");
		// Constants
		int IS_FULL_TIME = 1;
		//Computation
		double empCheck = Math.floor(Math.random() * 10) %2;
		
		int wagePerHr = 20;
		int FULL_DAY_HR = 8;
		int PART_DAY_HR = 4;
		
		int dailyWage;
		int wage = 0;
		int IS_FULL_DAY = 1;
		double dayType = Math.floor(Math.random()*10)%2;
		
		
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
			
			if (dayType == IS_FULL_DAY) { 
				System.out.println("Its a full day");
				wage = wage + (wagePerHr * FULL_DAY_HR);
				System.out.println("Wage is "+ wage);
			}
			else 
				System.out.println("Its a Part day");
			wage = wage + (wagePerHr * PART_DAY_HR);
			
			}
		else {
			System.out.println("Employee is absent");
	
		}
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your choice\n1.wages per month \n2.wages for a condition");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
		
		break;
	
		case 2:
		
		
		break;
		default:
			System.out.println("invalid choice");
			break;
		}
		
		
		
		
		
			
	}
}

