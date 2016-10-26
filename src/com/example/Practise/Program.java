package com.example.Practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args)  {
         String loc= "C:/Users/HOME/Documents/NetBeansProjects/Practise/testdata.txt";
         //Always put the txt file in the project folder
          //File file=new File(loc);
          String name;
          int mathMarks,scienceMarks,ehpMarks;
          List nameLst=new ArrayList();
          try{
              
              
          BufferedReader reader=new BufferedReader(new FileReader(loc));
          String line="";
          StringBuilder builder=new StringBuilder();
           String  ls = System.getProperty("line.separator");
        
          while((line=reader.readLine())!=null)
          {
            String buffer;
            buffer=line;
            int avg1;
            String[] split=line.split(" ");
              
            
            String avg=split[0]+ " "+split[1]+" "+split[2]+" "+split[3];
            nameLst.add(avg);
            int a=Integer.parseInt(split[1]);
              int b=Integer.parseInt(split[2]);
             int c= Integer.parseInt(split[3]);
             avg1=(a+b+c)/3;
              System.out.println("Avg marks of "+ split[0]+" is "+avg1);
            
            
            
          
          }
          String builderToString=builder.toString();
          
              System.out.print(nameLst);
          
          
          reader.close();
          
          }catch(IOException ioe)
          {
              ioe.printStackTrace();
          }
    
}}
