/*
Kelly Ryan
26 April 2019

Exercise 2

Create a Java program, which will generate and display a random number between 1 to 10 (inclusive).
Use the Random class as part of your solution. Run the program several times to see random numbers being generated.
Save your class as JFT13Ex2.java
 */

import java.util.Random;

public class JFT13Ex2 {

    public static void main (String[] args) {

        Random r = new Random();

        int rnum = r.nextInt(10) + 1;

        System.out.println(rnum);

    }
}
