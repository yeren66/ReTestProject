package discount;

public class VIPDiscount implements DiscountStrategy {

    @Override
    public double calculateDiscount(double price, String productType) {
        double discountPrice = price * 0.92; // 所有商品8%折扣
        if (productType.equals("Electronics")) {
            discountPrice *= 0.95; // 电子产品额外5%折扣
        }
        return discountPrice;
    }
}
