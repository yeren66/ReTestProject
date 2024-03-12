import discount.DiscountStrategy;
import discount.DiscountStrategyFactory;
import discount.StudentDiscountFactory;
import discount.VIPDiscountFactory;
import user.User;
import user.UserType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DiscountStrategyFactory studentDiscountFactory = new StudentDiscountFactory();
        DiscountStrategyFactory vipDiscountFactory = new VIPDiscountFactory();


        User student = new User("LiMing", UserType.STUDENT, studentDiscountFactory.createDiscountStrategy());
        User vip = new User("WangMei", UserType.VIP, vipDiscountFactory.createDiscountStrategy());

        student.buy(100, "Book");
        vip.buy(100, "Book");
        vip.buy(100, "Electronics");
    }
}