package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner input = new Scanner(System.in);
       System.out.println("What is the length of the room in feet?");
       int length = input.nextInt(); //Input
       System.out.println("What is the width of the room in feet?");
       int width = input.nextInt(); //Input
        //Converting square feet to square meters
         int f2 = length*width;
         double m2 = f2*.09290304;
       System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");//Output
       System.out.println("The area is " + "\n" + f2 + " square feet" + "\n" + m2 + " square meters");//Output

    }
}
