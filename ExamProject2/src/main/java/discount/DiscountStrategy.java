package discount;

public interface DiscountStrategy {
    double calculateDiscount(double price, String productType);
}
