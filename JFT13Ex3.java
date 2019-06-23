/*
Kelly Ryan
26 April 2019

Exercise 3

Create a Java program, which asks the user to enter a decimal number (create a Scanner object to facilitate input).

In this exercise, you will practice formatting decimal numbers.

Display the user entry rounded to two decimal places using:

(A): A DecimalFormat object.
(B): The printf() method.

Save your class as JFT13Ex3.java.

 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class JFT13Ex3 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal no.: ");
        double d = input.nextDouble();

        DecimalFormat decFormat = new DecimalFormat(".00");
        //decFormat.setMaximumFractionDigits(2);  //maximum of 2 numbers allowed after the decimal point.
        System.out.println("Using decimal format object: " + decFormat.format(d));
        System.out.printf("Using printf method: %.2f", d); //use the appropriate number of places to display a number and put 2 of these places to the right of the decimal point.


    }
}
