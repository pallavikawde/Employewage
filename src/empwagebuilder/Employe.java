package empwagebuilder;

import java.util.Scanner;

class OOPEmpWage
{
int wagePerHr;
int FULL_DAY_HR;
int PART_DAY_HR;
int IS_FULL_DAY = 1;
double dayType;
int month_wage=0;

public OOPEmpWage(int wagePerHr, int FULL_DAY_HR, int PART_DAY_HR)
{
	this.wagePerHr = wagePerHr;
	this.FULL_DAY_HR = FULL_DAY_HR;
	this.PART_DAY_HR = PART_DAY_HR;
}
//Employee Check method
public void empCheck(){
    //Computation
    int IS_FULL_TIME = 1;
    int wage = 0;
    double empCheck = Math.floor(Math.random() * 10) %2;
    dayType = Math.floor(Math.random()*10)%2;
    // Conditional statements
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
}

// Employee Wage method
public void empWage(){
    int i;
    int WORKING_DAYS_MONTH = 20;
     month_wage=0;
    int dailyWage;

    Scanner ch = new Scanner(System.in);
    System.out.println("Enter your choice \n1.Wages perMonth \n2.Wages for a condition for 20 days or for 100 hrs");
    int choice = ch.nextInt();

    switch(choice)
    {
        case 1:

            for(i=1;i<=WORKING_DAYS_MONTH;i++)
            {
                dayType = Math.floor(Math.random()*10)%2;

                if (dayType == IS_FULL_DAY) {
                    System.out.println(i+ "th "+"Its a full day");
                    month_wage = month_wage + (wagePerHr * FULL_DAY_HR);
                }
                else {
                    System.out.println(i+ "th "+"Its a Part day");
                    month_wage = month_wage + (wagePerHr * PART_DAY_HR);
                }
            }
            System.out.println("Wage Per Month "+month_wage);

            break;

        case 2:
            int days=0;
            int hr=0;
            while(days<=20 && hr<=100)
            {
                dayType = Math.floor(Math.random()*10)%2;

                if (dayType == IS_FULL_DAY) {
                    System.out.println("Its a full day");
                    month_wage = month_wage + (wagePerHr * FULL_DAY_HR);
                    days++;
                    hr = hr + FULL_DAY_HR;
                }
                else {
                    System.out.println("Its a Part day");
                    month_wage = month_wage + (wagePerHr * PART_DAY_HR);
                    days++;
                    hr = hr + PART_DAY_HR;
                }
            }
            System.out.println("days are "+days+"hours are "+hr);
            break;

        default:
            System.out.println("Invalid choice");
            break;
    }
}
// using getter methode for month wage
		public int getmonthwage() {
			return month_wage;
		}

}

public class Employe {
public static void main(String[] args){
    System.out.println("Welcome");
    System.out.println("** FOR Reliance");
    OOPEmpWage reliance = new OOPEmpWage(20,8,6);
    reliance.empCheck();
    reliance.empWage();
    //using getter
    System.out.println("wage for reliance"+reliance.getmonthwage());
    
    System.out.println("** FOR Pantaloon");
    OOPEmpWage pantaloon = new OOPEmpWage(30,9,5);
    pantaloon.empCheck();
    pantaloon.empWage();
    System.out.println("wage for pantaloon"+pantaloon.getmonthwage());
}
}