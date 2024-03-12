import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MainTest {

    @Test
    public void BasicTest1(){
        Employee a = new HourlyEmployee(1, "a", BigDecimal.valueOf(1000), LocalDate.of(2024, 1, 1));
        Assert.assertEquals(a.nextPayday(LocalDate.of(2024, 1,14)), LocalDate.of(2024, 1, 15));
        Assert.assertEquals(a.nextPayday(LocalDate.of(2024, 3,1)), LocalDate.of(2024, 3, 4));
        Assert.assertNull(a.nextPayday(LocalDate.of(2023, 1, 1)));

        Assert.assertEquals(a.totalSalary(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 2, 1)), BigDecimal.valueOf(5000));
        Assert.assertEquals(a.totalSalary(LocalDate.of(2024, 2, 1), LocalDate.of(2024, 3, 1)), BigDecimal.valueOf(4000));
        Assert.assertEquals(a.totalSalary(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 2, 1)), BigDecimal.valueOf(0));
    }

    @Test
    public void BasicTest2(){
        Employee a = new FullTimeEmployee(1, "a", BigDecimal.valueOf(8000), LocalDate.of(2024, 1, 3));
        Assert.assertEquals(a.nextPayday(LocalDate.of(2024, 1,14)), LocalDate.of(2024, 2, 1));
        Assert.assertEquals(a.nextPayday(LocalDate.of(2024, 3,1)), LocalDate.of(2024, 3, 1));
        Assert.assertNull(a.nextPayday(LocalDate.of(2023, 1, 1)));

        Assert.assertEquals(a.totalSalary(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 2, 3)), BigDecimal.valueOf(8000));
        Assert.assertEquals(a.totalSalary(LocalDate.of(2024, 2, 1), LocalDate.of(2024, 4, 3)), BigDecimal.valueOf(24000));
        Assert.assertEquals(a.totalSalary(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 2, 1)), BigDecimal.valueOf(0));
    }

    @Test
    public void BasicTest3(){
        Employee a = new HourlyEmployee(1, "a", BigDecimal.valueOf(1000), LocalDate.of(2024, 3, 1));
        Employee b = new FullTimeEmployee(2, "b", BigDecimal.valueOf(8000), LocalDate.of(2024, 1, 1));
        Employee hr = new HR(4, "hr", BigDecimal.valueOf(9000), LocalDate.of(2023, 3, 1));

        hr.addEmployee(a);
        hr.addEmployee(b);
        hr.addEmployee(hr);

        Assert.assertEquals(hr.calculateSalary(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 2, 1)), BigDecimal.valueOf(26000));
        Assert.assertEquals(hr.calculateSalary(LocalDate.of(2024, 3, 1), LocalDate.of(2024, 4, 1)), BigDecimal.valueOf(39000));


    }
}
