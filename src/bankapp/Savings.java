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
public class Savings extends Account {
    // list properties specific to savings account
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;
    
    // constructor to initialize settings
    public Savings (String name, String ssn, double initDeposit)
    {
        super( name, ssn, initDeposit );
        System.out.println("Savings Account: ");
        setSafetyDepositBox();
    }
    
    private void setSafetyDepositBox()
    {
        safetyDepositBoxId = (int)(Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
        System.out.println("Your Saftey Deposit Box ID: " + safetyDepositBoxId);
        System.out.println("Your saftey Deposit Box Key: " + safetyDepositBoxKey);
    }
      
 
    
}
