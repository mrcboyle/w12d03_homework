import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    staff.Employee employee;
    staff.management.Manager manager;

    @Before
    public void before(){
        employee = new staff.management.Manager("John Smith", "AB123456789", 40000.00, "Management");
    }

    @Test
    public void managerHasAName() {
        assertEquals("John Smith", employee.getName());
    }

    @Test
    public void managerHasANatInsNumber() {
        assertEquals("AB123456789", employee.getNatIns());
    }

    @Test
    public void managerHasASalary() {
        assert assertEquals(40000.00, employee.getSalary());
    }

}