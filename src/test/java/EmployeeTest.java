import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    staff.Employee employee;
    staff.management.Manager manager;

    @Test
    public void managerHasAName() {
        employee = new staff.management.Manager("John Smith", "AB123456789", 40000.00, "Management");
        assertEquals("John Smith", employee.getName());
    }

    @Test
    public void managerHasANatInsNumber() {
        employee = new staff.management.Manager("John Smith", "AB123456789", 40000.00, "Management");
        assertEquals("AB123456789", employee.getNatIns());
    }

    @Test
    public void managerHasASalary() {
        employee = new staff.management.Manager("John Smith", "AB123456789", 40000.00, "Management");
        assert assertEquals(40000.00, employee.getSalary());
    }
}
