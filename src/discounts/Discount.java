package discounts;

import com.hz.Customer;

public interface Discount {
    public double getDiscount(Customer customer, int currentProduct, int totalProducts);
}
