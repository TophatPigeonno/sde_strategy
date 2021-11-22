package products;

public class TVScreen implements Product {

    @Override
    public String getName() {
        return "TV screen";
    }

    @Override
    public double getPrice() {
        return 897.99;
    }
}