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
public class CheckingAccount extends Account {
    static double fee = 2;
    
    public CheckingAccount(double accBal){
        super(accBal);
    }
    
    @Override
    public void Credit(double credit){
        credit -= fee;
        super.Credit(credit);
    }
    
    @Override
    public void Debit(double debit){
        /*I came up with this before I saw the hint about making
         the Account debit method return a bool, but I think 
         it's just as short of a solution.
         It will check the balance first and only apply the fee if there is enough 
         and when it calls the Account debit method, it already displays 
         the message to them if it's too low.
         */
        if(super.getAccBal()>= (debit+fee))
            debit += fee;
        
        super.Debit(debit);
    }
    
}
