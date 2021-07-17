package empwagebuilder;

import java.util.Scanner;

class OOPEmpWage
{
    int wagePerHr = 20;
    int FULL_DAY_HR = 8;
    int PART_DAY_HR = 4;
    int IS_FULL_DAY = 1;
    double dayType;

    //
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

    public void empWage(){
        int i;
        int WORKING_DAYS_MONTH = 20;
        int month_wage=0;
        int dailyWage;

        Scanner ch = new Scanner(System.in);
        System.out.println("Enter your choice \n1.Wages perMonth \n2.Wages for a condition for 20 days or for 100hr");
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

}

public class Employe{
    public static void main(String[] args){
        System.out.println("Welcome");
        OOPEmpWage obj = new OOPEmpWage();
        obj.empCheck();
        obj.empWage();
    }
}

