package assignments.excercise;

/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Deaja Murphy
 */


/*
 * Print Statement asking for the two numbers
 * Assignment requires inputs to be converted from strings to ints
 * perform the different math equations
 */

import java.util.Scanner;
public class Solution05 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String user1 = userIn.nextLine();
        System.out.print("What is the second number? ");
        String user2 = userIn.nextLine();
        int num1 = Integer.parseInt(user1);
        int num2 = Integer.parseInt(user2);
        int sum = 0, difference = 0, product = 0, quotient = 0;

        sum = num1+num2;
        difference = num1-num2;
        product = num1*num2;
        quotient = num1/num2;

        System.out.print(num1 +" + " +num2 +" = " +sum
                +"\n" +num1 +" - " +num2 +" = " +difference
                +"\n" +num1 +" * " +num2 +" = " +product
                +"\n" +num1 +" / " +num2 +" = " +quotient);

    }
}
