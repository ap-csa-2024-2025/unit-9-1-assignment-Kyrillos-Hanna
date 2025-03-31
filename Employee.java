public class Employee extends Person {
    private String jobTitle;
    private int salary;
    public Employee(String name, int age, String jobTitle, int salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee() {
        this("John Doe", 0, "unemployed", 0);
    }
}
