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
public class MainClass {

   private static final int PAYMENT_TYPE_INDEX = 0 ;
    public static void main(String[] args) {
        
        Cart cart = new Cart();
        
        cart.addTshirt(new Tshirt("Tshirt",20));
        cart.addTshirt(new Tshirt("Hoodie",30));
        
       // cart.pay(PaymentMethodFactory.getPaymentMethod(args[PAYMENT_TYPE_INDEX]));
     
        
    }
    
}
