package products;

public class Airplane implements Product {

    @Override
    public String getName() {
        return "airplane";
    }

    @Override
    public double getPrice() {
        return 160000000;
    }
}
