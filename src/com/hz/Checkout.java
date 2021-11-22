package com.hz;

import discounts.Discount;
import discounts.BlackFriday;
import discounts.NoDiscount;
import discounts.ChristmasEve;

public class Checkout {

    public void nextInLine(Customer customer, Discount discount) {

        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice(discount, customer);
        String payInfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payInfo);
    }
}
