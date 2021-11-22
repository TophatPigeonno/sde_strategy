package com.hz;
import products.Product;
import discounts.Discount;

import java.util.ArrayList;

public class ShoppingCart extends ArrayList<Product> {
    int totalProducts = 0;

    /**
     * Calculates the total price of the shopping cart by processing the current products' price with a discount and adding them to the total price
     * @param discount the current discount
     * @param customer the customer
     * @return the total price
     */
    public double getTotalPrice(Discount discount, Customer customer) {

        double totalPrice = 0.0;

        for(Product product : this) {
            totalProducts += 1;

            int index = this.indexOf(product);

            double price = product.getPrice() - product.getPrice() * discount.getDiscount(customer, index, totalProducts);

            System.out.println("The price of " + product.getName() + " is " + price);
            totalPrice += price;
        }

        return totalPrice;
    }
}