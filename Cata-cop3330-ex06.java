/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */

import java.util.*;
import java.lang.*;

public class Main
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);   

       int current_year = Calendar.getInstance().get(Calendar.YEAR); //stores current year 


       System.out.print("What is your current age? ");  int age = in.nextInt(); //ask users to input current age
      
       System.out.print("At what age would you like to retire? ");       
       int retire_age = in.nextInt(); //ask user to input when they would like to retire   
      
       int years_left = retire_age - age;  //  subtracts total years left to retirement              
       System.out.println("You have " + years_left + " years left until you can retire.");  

       int retire_year = current_year + years_left;     
       System.out.println("It's " + current_year +", so you can retire in " + retire_year + "."); //prints for user what year they can retire
  
    }

}