package com.hz;

import products.Product;

public class Customer {
    // Attributes
        private boolean shownType = false;
        private CustomerType customerType;
        private String name;
        private ShoppingCart cart;

    // Methods
        /**
         * @param customerType the type of customer (new, regular)
         * @param name the customer's name
         */
        public Customer(CustomerType customerType, String name) {
            this.customerType = customerType;
            this.name = name;

            this.cart = new ShoppingCart();
        }

        public String getName() {
            return name;
        }

        public ShoppingCart getCart() {
            return cart;
        }

        /**
         * Outputs what the customer bought in console
         * Adds the bought product to the cart
         * @param product the bought product
         */
        public void buys(Product product) {
                System.out.println(name + " bought " + product.getName());
                this.cart.add(product);
        }

        /**
         * Shows the customer type in console if it has not been shown yet (happens only when there is NoDiscount)
        @return true if the customer is a regular
         */
        public CustomerType customerType() {
            if (!shownType) {
                shownType = true;
                System.out.println("(" + name + " is a " + customerType + " customer)");
            }
            return customerType;
        }
}