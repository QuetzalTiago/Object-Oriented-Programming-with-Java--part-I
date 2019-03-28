/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ama
 */
public class LyyraCard {
 private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        balance=balanceAtStart;
    }

    public String toString() {
        // write code here
        return "The card has "+this.balance+" euros";
    }
    public void payEconomical() {
    // write code here
    if (balance>=2.50){
    balance=balance-2.50;}
}

    public void payGourmet() {
    // write code here
    if (balance>=4.00){
    balance=balance-4.00;}
    }
    public void loadMoney(double amount) {
    // write code here
    double totalBalance = amount+balance;    
    if (amount>=0&&totalBalance<=150){
    balance +=amount;}
    else if (totalBalance>150) {
    balance = 150;}
}
    
     
}
