package org.example;

import java.util.Scanner;

public class PayrollCalculator {

    // scanner takes users input
    Scanner sc = new Scanner(System.in);

    public String name;
    public float hoursWorked;
    public float payRate;


   //method

    public float calculateGrossPay() {
        // If hours worked is over 40:
        // multiply pay rate by 1.5

        if (hoursWorked > 40) return (payRate * 40) + (hoursWorked - 40) * payRate * 1.5f;
        else return payRate * hoursWorked;

    }

    public void getUserName(){
        System.out.println("Enter your name");
        name = sc.nextLine();
    }

    public void getHoursWorked(){
        System.out.println("Enter hours worked");
        hoursWorked = sc.nextFloat();
    }

    public void getPayRate(){
        System.out.println("Enter your pay");
        payRate = sc.nextFloat();

    }




}
