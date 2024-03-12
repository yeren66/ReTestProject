import component.*;
import composite.Combination;

public class Main {
    public static void main(String[] args) {
        BasicComponent coffee = new Coffee();
        BasicComponent tea = new Tea();

        BasicComponent latte = new Milk(coffee);
        BasicComponent sweetTea = new Sugar(tea);

        BasicComponent combo1 = new Combination("Nice day");
        combo1.addMember(latte);
        combo1.addMember(sweetTea);

        BasicComponent menu = new Combination("Menu");
        menu.addMember(coffee);
        menu.addMember(tea);
        menu.addMember(latte);
        menu.addMember(sweetTea);
        menu.addMember(combo1);

        System.out.println(menu.getDescription());

        System.out.println(latte.cost());
        System.out.println(combo1.getDescription());
    }
}