package staff;

    public abstract class Employee {

        private String name;
        private String natIns;
        private double salary;

        public Employee(String name, String natIns, double salary){
            this.name = name;
            this.natIns = natIns;
            this.salary = salary;
        }

        // Getters
        public String getName() {
            return name;
        }

        public String getNatIns() {
            return natIns;
        }

        public double getSalary() {
            return salary;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setNatIns(String natIns) {
            this.natIns = natIns;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        //

        public void raiseSalary(double raise) {
            this.salary = salary + raise;
        }

//        public payBonus(double salary) {
//            return bonus = salary * 0.01;
//        }

}
