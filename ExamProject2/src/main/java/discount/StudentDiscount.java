package discount;

public class StudentDiscount implements DiscountStrategy {

    @Override
    public double calculateDiscount(double price, String productType) {
        if (productType.equals("Book")) {
            return price * 0.9; // 图书享受10%折扣
        }
        return price;
    }
}
