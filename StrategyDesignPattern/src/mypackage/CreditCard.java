/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author kostis
 */
public class CreditCard extends Card{

    public CreditCard(String nameOnCard, String number, String cvv, String expireDate) {
        super(nameOnCard, number, cvv, expireDate);
    }

   
    @Override
    protected String getType() {
        return "credit";
    }

    @Override
    protected void executeTransaction(int euros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
