package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // new instance
        PayrollCalculator payrollCalculator = new PayrollCalculator();

        payrollCalculator.getUserName();
        payrollCalculator.getHoursWorked();
        payrollCalculator.getPayRate();
        System.out.println("your gross pay is: " + payrollCalculator.calculateGrossPay());








    }
}