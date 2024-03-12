import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class HR extends FullTimeEmployee{

    ArrayList<Employee> employeesList = new ArrayList<>();
    public HR(int Id, String name, BigDecimal salary, LocalDate joinDate) {
        super(Id, name, salary, joinDate);
    }

    public void addEmployee(Employee e){
        // TODO: 添加员工
    }

    public void deleteEmployee(Employee e){
        // TODO: 删除员工
    }

    public BigDecimal calculateSalary(LocalDate startDate, LocalDate endDate){
        // TODO: 计算公司从startDate到endDate期间的工资支出
        return null;
    }
}
