package component;

public interface BasicComponent {

    public void addMember(BasicComponent b);
    public void deleteMember(BasicComponent b);
    public String getDescription();
    public double cost();
}
