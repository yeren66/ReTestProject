import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void BasicTest1(){
        Employee develop = new Develop("develop", Department.PROGRAMMER, 24, 10000, Language.JAVA);
        Employee unitTest = new UnitTest("unitTest", Department.PROGRAMMER, 22, 10000, Language.C);
        Employee ui = new UI("ui", Department.PROGRAMMER, 22, 10000, Language.C);

        Assert.assertEquals(develop.getBonus(3), 300, 0.01);
        Assert.assertEquals(develop.getBonus(6), 500, 0.01);
        Assert.assertEquals(develop.getSalary(3), 8300, 0.01);
        Assert.assertEquals(develop.getSalary(6), 8500, 0.01);

        Assert.assertEquals(unitTest.getBonus(3), 450, 0.01);
        Assert.assertEquals(unitTest.getBonus(10), 1000, 0.01);
        Assert.assertEquals(unitTest.getSalary(3), 8950, 0.01);
        Assert.assertEquals(unitTest.getSalary(10), 9500, 0.01);

        Assert.assertEquals(ui.getBonus(2), 100, 0.01);
        Assert.assertEquals(ui.getBonus(7), 300, 0.01);
        Assert.assertEquals(ui.getSalary(2), 7600, 0.01);
        Assert.assertEquals(ui.getSalary(7), 7800, 0.01);
    }

    @Test
    public void BasicTest2(){
        Manager manager = new Manager("manager", Department.PROGRAMMER, 23, 10000);
        Employee develop = new Develop("develop", Department.PROGRAMMER, 24, 10000, Language.JAVA);
        Employee unitTest = new UnitTest("unitTest", Department.PROGRAMMER, 22, 10000, Language.C);
        Employee ui = new UI("ui", Department.PROGRAMMER, 22, 10000, Language.C);
        Employee security = new Security("security", Department.SECURITY, 21, 10000, 'a');

        Assert.assertTrue(manager.lead(develop));
        Assert.assertTrue(manager.lead(unitTest));
        Assert.assertTrue(manager.lead(ui));
        Assert.assertFalse(manager.lead(security));

        Assert.assertTrue(manager.fire(develop));
        Assert.assertFalse(manager.fire(develop));

        Assert.assertTrue(manager.changeSalary(ui, 5000));
        Assert.assertFalse(manager.changeSalary(develop, 5000));
        Assert.assertEquals(ui.getSalary(0), 3750, 0.01);

        Assert.assertEquals(manager.inquires(unitTest), "unitTest, PROGRAMMER, 22, 10000.0");
        Assert.assertEquals(manager.inquires(develop), "Access Denied");
        Assert.assertEquals(manager.inquires(security), "Access Denied");

    }
}
