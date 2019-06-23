/*
Kelly Ryan
30 April 2019

Exercise 4

Create a Java program to calculate an employee's weekly take home pay.

The following information is standard for all employees.

 Basic Hourly Rate: Euro 29.39.
 Overtime Hourly Rate: 1.5 (time and a half).
 Income Tax Payable (@35%), if salary is greater than 2,000 Euro.
 Income Tax Payable (@20%), if salary is less than or equal to 2,000 Euro.

Using a Scanner object, prompt the user to enter the following information.
 Employee Name
 PPS No
 Department
 Hours Worked (basic and any overtime)

The program should display a salary slip for the employee. All numeric data should be formatted to two decimal places
using either a DecimalFormat object or the System.out.printf() method.

Save your class as JFT13Ex4.java.

 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class JFT13Ex4 {

    public static void main (String[] args) {

        double basicHourlyRate  = 29.39;
        double otHourlyRate = 1.5 * basicHourlyRate;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String empName = input.nextLine();
        System.out.print("Enter Employee PPS No.: ");
        String empPPS = input.nextLine();
        System.out.print("Enter Employee Department: ");
        String empDept = input.nextLine();
        System.out.print("Enter Basic Hours Worked: ");
        float basicHrsWorked = input.nextFloat();
        System.out.print("Enter Overtime Hours Worked: ");
        float otHrsWorked = input.nextFloat();

        double basicSalary = basicHrsWorked * basicHourlyRate;
        double otSalary = otHrsWorked * otHourlyRate;
        double grossSalary=  basicSalary + otSalary;
        double incomeTaxRate = grossSalary <= 2000 ? 0.2 : 0.35;
        double incomeTaxPayable = grossSalary * incomeTaxRate;
        double netPay = grossSalary - incomeTaxPayable;

        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat pf = new DecimalFormat();
        pf.setPositiveSuffix("%");
        pf.setMultiplier(100);

        System.out.println("**********************Salary Report***********************\n");
        System.out.println("*********************Employee Details*********************");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee PPs No.: " + empPPS);
        System.out.println("Employee Department: " + empDept);
        System.out.println("**********************Hours Worked************************");
        System.out.println("No. of basic hours worked: " + df.format(basicHrsWorked));
        System.out.println("The hourly rate of basic pay is at " + df.format(basicHourlyRate) + " euros.");
        System.out.println("Basic Pay: " + df.format(basicSalary));
        System.out.println("No. of overtime hours worked: " + df.format(otHrsWorked));
        System.out.println("The hourly rate of overtime is at time and a half.");
        System.out.println("Overtime salary: " + df.format(otSalary));
        System.out.println("***********************Take Home Pay**********************");
        System.out.println("Gross Pay: " + df.format(grossSalary));
        System.out.println("Income Tax Payable at " + pf.format(incomeTaxRate) + " is: " + df.format(incomeTaxPayable));
        System.out.println("Net Pay: " + df.format(netPay));
        System.out.println("**********************************************************");

    }
}
