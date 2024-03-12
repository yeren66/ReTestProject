package discount;

public class VIPDiscountFactory implements DiscountStrategyFactory {

    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new VIPDiscount();
    }
}
