package com.example.Practise;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
            int numberOfEggs;
            int gross = 0;
            int rem=0;
            int dozens=0;
            int finalrem=0;
            
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number of Eggs");
            numberOfEggs=input.nextInt();
            if(numberOfEggs>144)
            {
                gross=numberOfEggs/144;
                rem=numberOfEggs-(gross*144);
                if(rem>12)
                {
                     dozens = rem/12;
                     finalrem=rem-dozens*12;
                }
            }
       
            System.out.println("Your number of eggs is "+ gross+" gross,"+dozens+" dozens and "+ finalrem);
            

    }
    
}
