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
public class Checkings extends Account {
    // List properties specific to checking account
   private int debitCardNumber;
   private int debitPinNumber;
    
    // constuructor to intitialize checking account properties
    public Checkings (String name, String ssn, double initDeposit)
    {
        super(name, ssn, initDeposit);
        System.out.println("New Checkings Account: ");
        setDebitCard();
    }
    
    // list any methods specific to checking account
    private void setDebitCard()
    {
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitPinNumber = (int)(Math.random() * Math.pow(10, 4));
        System.out.println("Debit Card Number: " + debitCardNumber);
        System.out.println("Pin Number: " + debitPinNumber);
    }
       
    
}
