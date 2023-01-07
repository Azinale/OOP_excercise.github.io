/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankaccount;

/**
 *
 * @author MLemLoli
 */
public class SavingsAccount extends BankAccount
{  
   
   private double interestRate;
   
   public SavingsAccount(String anAccountNumber, String pass){
        super(anAccountNumber, pass);
        interestRate = 0.0;
   }
   
   public SavingsAccount(String anAccountNumber, String firstName, String lastName, String pass, 
                            double initialBalance, double rate) 
   {  
      super(anAccountNumber, firstName, lastName, pass, initialBalance);
      interestRate = rate;
   }
  
   public void addInterest() 
   {  
      double interest = getBalance() * interestRate / 100;
      deposit(interest); 
   }
   
   public double getInterestRate(){
             
        return interestRate;
   }

    
    public String toString(){
        
        return  "AccountN."+super.getAccountNumber()+"; Name: " + super.getFirstName()+ " "+ super.getLastName()+ 
                "; Balance: " + String.valueOf(super.getBalance()) + ". Interest rate : " + interestRate;   
    }

}
