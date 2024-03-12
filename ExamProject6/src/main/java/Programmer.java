public abstract class Programmer extends Employee{
    private Language type; // java 或 c

    public Programmer(String name, Department department, int age, double salary, Language type) {
        super(name, department, age, salary);
        this.type = type;
    }


}
