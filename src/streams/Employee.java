package streams;

public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    // Constructor, getters, and setters
    public Employee(String name, int age, String department, double salary) {
        this.salary = salary;
        this.age = age;
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

