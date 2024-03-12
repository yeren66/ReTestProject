package discount;

public class StudentDiscountFactory implements DiscountStrategyFactory{
    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new StudentDiscount();
    }
}
