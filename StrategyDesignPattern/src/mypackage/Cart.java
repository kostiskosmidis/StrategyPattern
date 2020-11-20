/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kostis
 */
public class Cart {
    
    private List<Tshirt> tshirts = new ArrayList();
    
    public void addTshirt(Tshirt tshirt) {
        
        tshirts.add(tshirt);
      }
    
    public void removeTshirt(Tshirt tshirt){
    
    tshirts.remove(tshirt);
   }
    
    public int getCostInEuros(){
    
    return tshirts.stream().mapToInt(item->item.getPrice()).sum();
    
    }
    
    public void pay(PaymentMethod method){
    
    method.pay(getCostInEuros());
    
    }
    
}
