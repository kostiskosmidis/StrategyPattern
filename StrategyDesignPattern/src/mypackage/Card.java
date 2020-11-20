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
public abstract class Card implements PaymentMethod{

    private final String nameOnCard;
    private final String number;
    private final String cvv;
    private final String expireDate;

    public Card(String nameOnCard, String number, String cvv, String expireDate) {
        this.nameOnCard = nameOnCard;
        this.number = number;
        this.cvv = cvv;
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "Card{" + "nameOnCard=" + nameOnCard + ", number=" + number + ", cvv=" + cvv + ", expireDate=" + expireDate + '}';
    }

    
    @Override
    public void pay(int euros) {
        System.out.println("Payed " + euros + " euros using " + toString());
    }
    
    
    protected abstract String getType();
    protected abstract void executeTransaction(int euros);
}
