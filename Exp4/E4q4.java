package Exp4;

class E4q4 {
    static class Person {
        private String name;
        public Person(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    public static class Employee extends Person {
        private double annualSalary;
        private int startYear;
        private String nationalInsuranceNumber;

        public Employee(String name, double annualSalary, int startYear, String nationalInsuranceNumber) {
            super(name);
            this.annualSalary = annualSalary;
            this.startYear = startYear;
            this.nationalInsuranceNumber = nationalInsuranceNumber;
        }

        public double getAnnualSalary() {
            return annualSalary;
        }

        public int getStartYear() {
            return startYear;
        }

        public String getNationalInsuranceNumber() {
            return nationalInsuranceNumber;
        }

        public boolean equal(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Employee employee = (Employee) obj;
            return Double.compare(employee.annualSalary, annualSalary) == 0 &&startYear == employee.startYear &&nationalInsuranceNumber.equals(employee.nationalInsuranceNumber) &&getName().equals(employee.getName());
        }

        public static void main(String[] args) {
            Employee employee1 = new Employee("Om uskaikar", 50000, 2010, "ABC123");
            Employee employee2 = new Employee("Aditya", 60000, 2015, "XYZ456");
            Employee employee3 = new Employee("Om uskaikar", 50000, 2010, "ABC123");

            System.out.println("Employee 1: " + employee1.getName() + ", Salary: $" + employee1.getAnnualSalary() +
                    ", Start Year: " + employee1.getStartYear() + ", National Insurance Number: " + employee1.getNationalInsuranceNumber());

            System.out.println("Employee 2: " + employee2.getName() + ", Salary: $" + employee2.getAnnualSalary() +
                    ", Start Year: " + employee2.getStartYear() + ", National Insurance Number: " + employee2.getNationalInsuranceNumber());

            System.out.println("Employee 1 equals Employee 2: " + employee1.equal(employee2));
            System.out.println("Employee 1 equals Employee 3: " + employee1.equal(employee3));
        }
    }

}
