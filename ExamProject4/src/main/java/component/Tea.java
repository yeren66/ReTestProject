package component;

public class Tea implements BasicComponent{

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
    @Override
    public String getDescription() {
        return "a cup of tea. ";
    }

    @Override
    public double cost() {
        return 15.0;
    }
}
