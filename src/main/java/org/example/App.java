package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        String num = se.nextLine();
        int mo = Integer.parseInt(num);

        String month;

        switch (mo) {
            case 1:  month = "The name of the month is January.";
                break;
            case 2:  month = "The name of the month is February.";
                break;
            case 3:  month = "The name of the month is March.";
                break;
            case 4:  month = "The name of the month is April.";
                break;
            case 5:  month = "The name of the month is May.";
                break;
            case 6:  month = "The name of the month is June.";
                break;
            case 7:  month = "The name of the month is July.";
                break;
            case 8:  month = "The name of the month is August.";
                break;
            case 9:  month = "The name of the month is September.";
                break;
            case 10: month= "The name of the month is October.";
                break;
            case 11: month= "The name of the month is November.";
                break;
            case 12: month = "The name of the month is December.";
                break;
            default: month = "Invalid input";
                break;
        }
        System.out.println(month);
    }
}
