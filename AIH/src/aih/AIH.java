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
public class AIH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(5000);
        savings.Credit(200);
        savings.Debit(100);
        double sBalance = savings.getAccBal();
        System.out.println(sBalance);
        
        //Adding interest
        savings.Credit(savings.CalculateInterest());
        sBalance = savings.getAccBal();
        System.out.println(sBalance);
        
        CheckingAccount checking = new CheckingAccount(900);
        checking.Credit(100);
        checking.Debit(50);
        double cBalance = checking.getAccBal();
        System.out.println(cBalance);
    }
    
}
