/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aih;

/**
 *
 * @author Rose
 */
public abstract class Account {
    private double accBal;  
    
    public Account(double accBal){
        if(accBal >= 0.0)
        this.accBal = accBal;
    }
    
    public void Credit(double credit){
        accBal += credit;
    }
    
    public void Debit(double debit){
        if((accBal-debit) >= 0){
            accBal -= debit;
        }else{
            System.out.println("Debit amount exceeded account balance");
        }
    }

    public double getAccBal() {
        return accBal;
    }
}
