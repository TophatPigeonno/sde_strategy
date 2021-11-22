package discounts;

import com.hz.Customer;

public class ChristmasEve implements Discount {

    @Override
    public double getDiscount(Customer customer, int currentProduct, int totalProducts) {
        double discount = 0.0;
        // every customer gets 20% off first product and 12.5% off the rest
            if(currentProduct == 0) {
                discount = .20;
            } else {
                discount = .125;
            }
        return discount;
    }
}
