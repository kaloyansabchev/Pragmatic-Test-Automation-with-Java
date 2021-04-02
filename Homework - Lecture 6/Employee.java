public class Employee extends Person {
    private static final int OVERTIME_AGE = 18;
    private static final double OVERTIME = 1.5;

    private double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours) {
        if (getAge() < OVERTIME_AGE) {
            return 0;
        } else {
            return hours * OVERTIME * daySalary / 8;
        }
    }

    public void showEmployeeInfo() {
        showPersonInfo();
        System.out.println("Employee's day salary is: " + daySalary);
    }
}
