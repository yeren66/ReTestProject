import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Employee {
    int Id;
    String name;
    BigDecimal salary;
    LocalDate joinDate;

    public Employee(int Id, String name, BigDecimal salary, LocalDate joinDate){
        this.Id = Id;
        this.name = name;
        this.salary = salary;
        this.joinDate = joinDate;
    }

    public abstract LocalDate nextPayday(LocalDate currentDate);

    public abstract BigDecimal totalSalary(LocalDate startDate, LocalDate endDate);

    public void addEmployee(Employee e){
        return;
    }

    public void deleteEmployee(Employee e){
        return;
    }

    public BigDecimal calculateSalary(LocalDate startDate, LocalDate endDate){
        return null;
    }

}
