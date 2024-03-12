public class Security extends Employee{

    private char area; // a, b, c, 或 d

    public Security(String name, Department department, int age, double salary, char area) {
        super(name, department, age, salary);
        this.area = area;
    }


    @Override
    public double getSalary(int overtime) {
        return salary;
    }

    @Override
    public double getBonus(int overtime) {
        return 0;
    }
}
