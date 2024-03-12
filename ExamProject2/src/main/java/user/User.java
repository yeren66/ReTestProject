package user;

import discount.DiscountStrategy;

public class User {
    private UserType userType;
    private DiscountStrategy strategy;
    private String name;

    public User(String name, UserType userType, DiscountStrategy strategy) {
        this.name = name;
        this.userType = userType;
        this.strategy = strategy;
    }

    public void buy(double price, String type) {
        double totalPrice = strategy.calculateDiscount(price, type);
        System.out.println(userType + " " + name + " cost: " + totalPrice);
    }
}
