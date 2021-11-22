package discounts;

import com.hz.Customer;

public class BlackFriday implements Discount {

    @Override
    public double getDiscount(Customer customer, int currentProduct, int totalProducts) {
        double discount = 0.0;
        // number of products = discount in %
            discount = totalProducts * 0.01;
            if (discount > .8) {
                discount = .8;
            }
        return discount;
    }
}
