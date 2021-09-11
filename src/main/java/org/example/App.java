package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main( String[] args )
    {

        //Initialize Scanner
        Scanner input = new Scanner(System.in);

        double tax;
        double order;

        System.out.println("What is the order amount? ");
        order = input.nextDouble();
        System.out.println("What is the state? ");
        String state = input.next();

        //Calculate Tax
        tax = 5.5 * order / 100;

        //detects if WI or other and calculates based on input
        if (state.equals("WI"))
        {
            System.out.format("The subtotal is $%.2f\nThe tax is $%.2f\nThe total is $%.2f", order, tax, tax + order);

            return;
        }
        System.out.format("The total is $%.2f", order);

    }
}
