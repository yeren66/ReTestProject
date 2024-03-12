public abstract class Employee {
    protected String name;
    protected Department department;
    protected int age;
    protected double salary;

    // 构造方法
    public Employee(String name, Department department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    public abstract double getSalary(int overtime);

    public abstract double getBonus(int overtime);

}
