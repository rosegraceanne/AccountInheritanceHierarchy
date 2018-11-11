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
public class SavingsAccount extends Account {
    static final double ROI = 0.05;
    
    public SavingsAccount(double accBal){
        super(accBal);
    }
    
    public double CalculateInterest(){
        return (ROI * super.getAccBal());
    }
}
