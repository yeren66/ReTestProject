import java.math.BigDecimal;
import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    public HourlyEmployee(int Id, String name, BigDecimal salary, LocalDate joinDate) {
        super(Id, name, salary, joinDate);
    }

    @Override
    public LocalDate nextPayday(LocalDate currentDate) {
        // TODO: 返回currentDate之后的第一个发薪日，对于钟点工来说，发薪日为每周其入职的那一天。
        return null;
    }

    @Override
    public BigDecimal totalSalary(LocalDate startDate, LocalDate endDate) {
        // TODO: 返回在startDate到endDate期间给这位员工发的所有薪水。
        return null;
    }


}
