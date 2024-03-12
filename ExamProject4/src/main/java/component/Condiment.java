package component;

public abstract class Condiment implements BasicComponent {
    BasicComponent beverage;
    double cost;

    public Condiment(BasicComponent beverage, double cost){
        this.beverage = beverage;
        this.cost = cost;
    }
    @Override
    public double cost(){
        return beverage.cost() + cost;
    }
}
