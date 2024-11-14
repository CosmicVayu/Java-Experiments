

class Employee {
    private String name;
    private String lastName;
    private double monthlySalary;

    public Employee(String name, String lastName, double monthlySalary) {
        this.name = name;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * percentage / 100;
        }
    }
}


public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 3000);
        Employee employee2 = new Employee("Jane", "Smith", 3500);

        System.out.println("Yearly Salary of " + employee1.getName() + " " + employee1.getLastName() + ": $" + employee1.getYearlySalary());
        System.out.println("Yearly Salary of " + employee2.getName() + " " + employee2.getLastName() + ": $" + employee2.getYearlySalary());

        employee1.giveRaise(10);
        employee2.giveRaise(10);

        System.out.println("Yearly Salary of " + employee1.getName() + " " + employee1.getLastName() + " after 10% raise: $" + employee1.getYearlySalary());
        System.out.println("Yearly Salary of " + employee2.getName() + " " + employee2.getLastName() + " after 10% raise: $" + employee2.getYearlySalary());
    }
}
