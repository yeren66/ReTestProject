import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<Employee> employees = new ArrayList<>();

    public Manager(String name, Department department, int age, double salary) {
        super(name, department, age, salary);
    }

    @Override
    public double getSalary(int overtime) {
        return salary;
    }

    @Override
    public double getBonus(int overtime) {
        return 0;
    }

    public boolean lead(Employee e) {
        // TODO: 将员工e加入自己的管理列表，只能加入相同部门的员工，员工不能重复加入，成功则返回True，失败则返回False
        return true;
    }

    public boolean fire(Employee e){
        // TODO: 将管理列表中的员工e删除（如果存在该员工），成功则返回True，失败则返回False
        return true;
    }

    public boolean changeSalary(Employee e, double salary){
        // TODO: 修改员工e的工资，只能修改管理列表内的员工，成功则返回True，失败则返回False
        return true;
    }

    public String inquires(Employee e) {
        // TODO: 查看员工e的信息，只能查看管理列表内的员工的信息，失败返回"Access Denied"
        // 员工信息按照 name, department, age, salary的格式返回
        return "";
    }
}