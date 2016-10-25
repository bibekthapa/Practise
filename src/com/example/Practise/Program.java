package com.example.Practise;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
          System.out.println("Please Enter your first name and last name separated by space");
          Scanner input=new Scanner(System.in);
          String name=input.nextLine();
         String[] nameAr=name.split(" ");
         System.out.println("Your first name is "+ nameAr[0]+" which has "+ nameAr[0].length()+" characters");
         
           System.out.println("Your last name is "+ nameAr[1]+" which has "+ nameAr[1].length()+" characters");
          System.out.println("Your initials are "+ nameAr[0].charAt(0)+nameAr[1].charAt(0));
          System.out.println(name);
          
    
}}
