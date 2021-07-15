package empwagebuilder;

import java.util.Scanner;
// create class
public class Employe {
	//use main methode
	public static void main(String[] args) {
		System.out.println("Welcome");
		// Constants
		int IS_FULL_TIME = 1;
		
		//initialize value for month wages
		 int WORKING_DAYS_MONTH=20;
		 int i=0;
		 int month_wage=0;
		//Computation
		 
		double empCheck = Math.floor(Math.random() * 10) %2;
		
		//initialize value	for hr
	
		int wagePerHr = 20;
		int FULL_DAY_HR = 8;
		int PART_DAY_HR = 4;
		int wage = 0;
		int IS_FULL_DAY = 1;
		
		double dayType = Math.floor(Math.random()*10)%2;
		
		//use if else
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
		
			for( i=1;i<=WORKING_DAYS_MONTH;i++)
			{
				dayType = Math.floor(Math.random()*10)%2;
				
					if (dayType == IS_FULL_DAY) { 
						System.out.println(" Its a full day "+i );
						month_wage = month_wage + (wagePerHr * FULL_DAY_HR);
						
					}
					else 
						System.out.println("Its a Part day " +i);
						month_wage = month_wage + (wagePerHr * PART_DAY_HR);
					}
			
		System.out.println("monthly wage is="+month_wage);
			
		
		break;
	
		case 2:
			int days=0;
			int hr=0;
		while(days<=20  && hr<=100) {
			dayType = Math.floor(Math.random()*10)%2;
		
		if (dayType == IS_FULL_DAY) { 
			System.out.println("Its a full day " );
			month_wage = month_wage + (wagePerHr * FULL_DAY_HR);
			days++;
			hr=hr+ FULL_DAY_HR;
			
		}
		else { 
			System.out.println("Its a Part day " );
			month_wage = month_wage + (wagePerHr * PART_DAY_HR);
			days ++;
			hr=hr+PART_DAY_HR;
		}
		}
		
		System.out.println("days are =" +days+ " hr is =" +hr);
			
		break;
		default:
			System.out.println("invalid choice");
			break;
		}
		
		
		
		
		
			
	}
}

