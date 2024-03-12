package component;

public class Sugar extends Condiment{

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
    public Sugar(BasicComponent beverage) {
        super(beverage, 3.0);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "add sugar on it. ";
    }
}
