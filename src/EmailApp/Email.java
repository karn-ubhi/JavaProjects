/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailApp;

import java.util.Scanner;

/**
 *
 * @author Karndeep Ubhi
 */
public class Email {
    
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private int defaultPasswordLength=10;
   private String email;
   private String companyName;
   
   
   // constructor to recieve the first and last name
   
   public Email()
   {
       this.firstName=firstName;
       this.lastName=lastName;
       this.companyName= companyName;
       
       
       Scanner ot=new Scanner(System.in);
       System.out.println("Please Enter First Name");
       firstName = ot.next();
       System.out.println("Please Enter Your Last Name");
       lastName = ot.next();
       System.out.println("Please Enter Your Company Name");
       companyName = ot.next();
      

   this.department=setDepartment();
   System.out.println("Department:" +this.department);
   
   
   //create email
   email= firstName + lastName +"."+ department +"@"+ companyName +".com";
   System.out.println("New Email: "+ email);
   
 
   //call a method that returns a random password
   this.password = randomPassword(defaultPasswordLength);
   System.out.println("Your password is: "+this.password);
   
   }
   
   // Ask for the department
   private String setDepartment()
   {
       System.out.println("Enter the department codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for Other\nEnter codes:");
      Scanner in=new Scanner(System.in);
       int deptChoice= in.nextInt();
       switch (deptChoice)
       {
           case 1:
                   return "Sales";
                   
           case 2:
               return "Development";
              
           case 3: 
               return "Accounting";
               
           case 0: 
               return "Other";          
                           
       }
       return null;
   }
   
   
   
   //Generate a random password
   private String randomPassword(int length)
   {
       String passwordSet="ABCDEFG1234567!@#$%&*";
       char[] password= new char[length];
       for (int i=0; i<length; i++)
       {
          int rand= (int)(Math.random() * passwordSet.length());
          password[i]=passwordSet.charAt(rand);
       }
      
               return new String(password);
   }

    
}
