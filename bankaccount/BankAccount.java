
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Create a class BankAccount with variables
number :int,
amount :double,
name      :String,
active :boolean,
transactions: List<String>
Getters/Setters
2. Create methods deposit(), withdraw(). Do we need the setter for amount?
3. Store each action (deposit, withdraw, creation) in the transactions.
4. Create static/class variable accountsOpened. This variable shows how many accounts have been opened. How to access it??? With an object or class?
5. Create 3 constructors (default, name-number, all(except transactions)). When created all will be active.
6. Create 3 BankAccounts in MainClass.
7. print transactions of 2 bank accounts. (printTransactions???)./*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.ArrayList;

/**
 *
 * @author dsid
 */
public class BankAccount {
  private int number;
  private double amount;
  private String name;
  private boolean active;
  private ArrayList<String> transactions =new ArrayList<String>();
  static private int accountsOpened;
  
  
  public BankAccount(){
      accountsOpened++;
  }
  public int getAccountsOpened(){
      return accountsOpened;
  }
  public BankAccount(String name, int number){
      this.name=name;
      this.number=number; 
      accountsOpened++;
  }
  public BankAccount(String name, int number, boolean active){
      this.name=name;
      this.number=number;
      this.active=active;
      accountsOpened++;
  }
  public void setNumber(int number){
   this.number=number;          
  }
  public int getNumber(){
   return number;           
  }
  public double getAmount(){
          return amount;
  }
  public void setName(String name){
      this.name=name;
  }
  public String getName(){
      return name;
  }
  public void setActive(boolean active){
      this.active=active;
  }  
  public boolean getActive(){
      return active;
  }
  public void showTransactions(){
      System.out.println(transactions);
  }
  public double deposit(double newDeposit){
      amount=amount+newDeposit;
      transactions.add("Deposit "+newDeposit);
      return amount; 
  }
  public double withdraw(double newWithdraw){
      amount=amount-newWithdraw;
      transactions.add("Withdraw "+newWithdraw);
      return amount;
  }
}
