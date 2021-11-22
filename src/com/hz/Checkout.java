package com.hz;

import discounts.Discount;

public class Checkout {

    /**
     * Processes a customer's payment info
     * @param customer the customer at the register
     * @param discount the current discount
     */
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
