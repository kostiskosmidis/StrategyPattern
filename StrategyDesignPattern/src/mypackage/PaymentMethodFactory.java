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
public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(String type) {

        switch (type) {

            case "credit":
                return createCreditCard();
            case "cash":

                return createCash();

        }
        throw new IllegalArgumentException();

    }

    public static CreditCard createCreditCard() {
        return new CreditCard("Kostis", "4111111111", "123", "01/22");
    }

    public static Cash createCash() {
        return new Cash();
    }
}
