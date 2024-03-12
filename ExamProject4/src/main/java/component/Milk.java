package component;

public class Milk extends Condiment{

    @Override
    public void addMember(BasicComponent b) {
        System.out.println("component can not add member!");
        return;
    }

    @Override
    public void deleteMember(BasicComponent b) {
        System.out.println("component can not delete member!");
        return;
    }

    public Milk(BasicComponent beverage) {
        super(beverage, 5.0);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "add milk on it. ";
    }


}
