package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{

    static final int sf_per_gal = 350;

    public static void main( String[] args )
    {

        int length, width, area;

        double gallon;

        String temp;

        Scanner s = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");

        temp = s.nextLine();

        length = String_to_int(temp);

        System.out.print("What is the width of the room in feet? ");

        temp =  s.nextLine();

        width = String_to_int(temp);

        area = length * width;

        gallon = ((double)area)/sf_per_gal;

        System.out.print("You will need to purchase " + ceiling(gallon) + " gallons of paint to cover " + area + " square feet.");

        s.close();

    }

    private static int ceiling(double input){

        int temp = (int) input;

        if(input > temp){

            return temp+1;

        }

        return temp;

    }

    private static int String_to_int(String s){

        int res = 0;

        for(int i = 0; i < s.length(); i++){

            res += (s.charAt(i)-'0')*pow(10, s.length()-1-i);

        }

        return res;

    }

    private static int pow(int base, int exponent){

        int res = 1;

        for(int i = 0; i < exponent; i++){

            res *= base;

        }

        return res;

    }

}
