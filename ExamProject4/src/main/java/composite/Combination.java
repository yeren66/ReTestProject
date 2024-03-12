package composite;

import component.BasicComponent;

import java.util.ArrayList;

public class Combination implements BasicComponent {

    ArrayList<BasicComponent> member = new ArrayList<>();
    String name;

    public Combination(String name){
        this.name = name;
    }

    public void addMember(BasicComponent b){
        member.add(b);
    }

    public void deleteMember(BasicComponent b){
        member.remove(b);
    }


    @Override
    public String getDescription() {
        String description = this.name + "\n";
        for(BasicComponent b: member){
            description += b.getDescription() + "\n";
        }
        return description;
    }

    @Override
    public double cost() {
        double cost = 0;
        for(BasicComponent b: member){
            cost += b.cost();
        }
        return cost;
    }
}
