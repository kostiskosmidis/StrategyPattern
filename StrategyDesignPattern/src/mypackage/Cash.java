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
public class Cash implements PaymentMethod{

    @Override
    public void pay(int euros) {
        System.out.println("Payed " + euros + " euros using cash");
    }
    
}
