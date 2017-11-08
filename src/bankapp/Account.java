/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author Karndeep Ubhi
 */
public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts
    private String name;
    private String ssn;
    private double balance;
    private static int index= 1000;
    protected String accountNumber;
    
    
    
    // Constructor to set base properties and intialize account
    public Account(String name, String ssn, double initDeposit)
    {
        this.name = name;
        this.ssn = ssn;
        balance = initDeposit;
        System.out.println("Name: "+name+"SSN: "+ssn+"Balance: $"+balance);
    
    this.accountNumber= setAccountNumber();
    System.out.println("Account Number" + this.accountNumber);
    
    }
    
    
    //set account number
    private String setAccountNumber()
    {
        String lastThreeOfSsn= ssn.substring(6);
        int uniqueId= index;
        int randomNumber= (int)(Math.random() * Math.pow(10, 2));
        return lastThreeOfSsn + uniqueId + randomNumber;
   }
     
    
    // List common methods
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void withdraw (double amount)
    {
        balance = balance - amount;
    }
    public void printBalance()
    {
        System.out.println("Balance: " + balance);
    }
       
            
}
