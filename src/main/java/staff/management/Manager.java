package staff.management;

public class Manager extends staff.Employee {

    private String deptName;

    public Manager(String name, String natIns, double salary, String deptName) {
        super(name, natIns, salary);
        this.deptName = deptName;
    }

    // Getters
    public String getDeptName() {
        return deptName;
    }

    // Setters
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
