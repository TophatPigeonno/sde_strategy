package discounts;

import com.hz.Customer;
import com.hz.CustomerType;

public class NoDiscount implements Discount {

    @Override
    public double getDiscount(Customer customer, int currentProduct, int totalProducts) {
        double discount = 0.0;
        // regulars get 15% off
        if(customer.customerType() == CustomerType.Regular) {
            discount = .15;
        };
        return discount;
    }
}
