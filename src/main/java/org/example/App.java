/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean correctInput = false;
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();
        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();
        System.out.print("Where are you located? ");
        String location = scanner.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " +
                adverb + " in " + location + "? That's hilarious!");
    }
}
