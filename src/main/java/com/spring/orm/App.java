package com.spring.orm;

import java.util.Scanner;
import com.spring.orm.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.Dao.*;
import com.spring.orm.Entity.Players;


/**
 * Hello world!
 *
 */
public class App 
{
	//@Autowired
	//static PlayersDaoImpl playersDaoImpl;
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("myapp.xml");
    	PlayersServiceDaoIMPL playersServiceDaoIMPL=context.getBean("playersServiceDaoIMPL",PlayersServiceDaoIMPL.class);
    	
    	
    	System.out.println("Welcome to F C KIET!!!!!!");
    	int i=0;
    	while(i==0)
    	{
      // System.out.println("Welcome to F C KIET");
       System.out.println("press 1 to register yourself for tryouts");
       System.out.println("press 2 to update your name");
       System.out.println("press 3 to take back your registration");
       System.out.println("press 4 to know if you are already registered");
       System.out.println("press 5 to exit the application");
       
       
       Scanner sc=new Scanner(System.in);
       int input=sc.nextInt();
       if(input==1)
       {
			/*
			 * System.out.print("Enter your rollno: "); int roll=sc.nextInt();
			 */
    	   System.out.print("Enter your name: ");
    	   sc.nextLine();
    	   String name=sc.nextLine();
    	   System.out.print("Enter your passout year: ");
    	   String year=sc.next();
    	   System.out.print("Enter your prefered position(abbreviation will be enough): ");
    	   String pos=sc.next();
    	   
    	   Players player=new Players(name,year,pos);
    	   //int j=dao.insert(player);
    	   System.out.println("No. of players registered is : "+playersServiceDaoIMPL.insert(player));
       }
       else if(input==2)
       {
    	   System.out.println("Enter your rollno:");
    	   int roll=sc.nextInt();
    	   sc.nextLine();
    	   System.out.println("Enter your correct name:");
    	   String name=sc.nextLine();
    	   playersServiceDaoIMPL.update(roll, name);
       }
       else if(input==3)
       {
    	  System.out.println("Enter your rollno: ");
    	  int roll=sc.nextInt();
    	  playersServiceDaoIMPL.remove(roll);
       }
       else if(input==4)
       {
    	  System.out.println("Enter your rollno to check:"); 
    	  int roll=sc.nextInt();
    	  System.out.println(playersServiceDaoIMPL.getinfo(roll));
       }
       else if(input==5)
       {
    	   i=1;
    	   System.out.println("Thanks for visiting our place");
       }
       else
       {
    	   i=0;
    	   System.out.println("Please enter a valid number");
       }
       
    	}
       
    }
	
}
