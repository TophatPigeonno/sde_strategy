package com.hz;

import discounts.Discount;
import discounts.NoDiscount;
import discounts.ChristmasEve;
import discounts.BlackFriday;

import products.Airplane;
import products.BlenderWithIntegratedRadio;
import products.CuteTeddyBear;
import products.TVScreen;

public class Main {

    // Main scenario
    public static void main(String[] args) {

        // There is a shop with a checkout
            Checkout register5 = new Checkout();

        // There can be a discount (ChristmasEve, NoDiscount, BlackFriday)
            Discount discount = new BlackFriday();
            System.out.println("> The current discount is " + discount.getClass().getSimpleName());

        // Two customers enter the shop
            System.out.println(" ");
            System.out.println("> Customers enter shop");
            Customer piet = new Customer(CustomerType.Regular, "Piet");
            Customer anne = new Customer(CustomerType.New, "Anne");

        // The customers buy stuff
            System.out.println(" ");
            System.out.println("> Customers buy stuff");

            piet.buys(new TVScreen());
            piet.buys(new Airplane());

            anne.buys(new TVScreen());
            anne.buys(new CuteTeddyBear());
            anne.buys(new BlenderWithIntegratedRadio());

        // The customers proceed to checkout
            System.out.println(" ");
            System.out.println("> Customers proceed to checkout");

            register5.nextInLine(piet, discount);

            System.out.println(" ");

            register5.nextInLine(anne, discount);
    }
}
