package component;

public class Coffee implements BasicComponent{
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
        return "a cup of coffee. ";
    }

    @Override
    public double cost() {
        return 12.0;
    }
}
