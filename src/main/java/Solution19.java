/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Scanner;

public class Solution19 {

    public static void main (String[] agrs){

        Scanner input = new Scanner(System.in);
        double bmi, weight, height;

        System.out.println("What is your height?");
        height = input.nextDouble();

        System.out.println("What is your weight?");
        weight = input.nextDouble();

        bmi = (weight / (height * height)) * 703;

        if(bmi > 18.5 && bmi < 25)
            System.out.println("Your BMI is " + bmi + ". You are within ideal weight range.");
        if(bmi < 18.5)
            System.out.println("Your BMI is " + bmi + ". You are under weight, see a doctor.");
        if(bmi > 25)
            System.out.println("Your BMI is " + bmi + ". You are over weight, see a doctor.");
    }

}
