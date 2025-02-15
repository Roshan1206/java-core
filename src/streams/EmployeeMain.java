package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 28, "HR", 40000),
                new Employee("Jane", 35, "Finance", 60000),
                new Employee("Mark", 42, "IT", 75000),
                new Employee("Mary", 24, "Finance", 45000),
                new Employee("Mike", 31, "HR", 50000)
        );

//      Print the names of all employees who are older than 30 years.
        List<Employee> employeeAbove30 = employees.stream().filter(employee -> employee.getAge()>30).toList();
        employeeAbove30.forEach(employee -> System.out.println(employee.getName() + "\t" + employee.getAge()));

//      Calculate and print the average salary of employees in each department.
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .forEach((department, salary) -> System.out.println(department + "\t" + salary));

//      Find the highest-paid employee and print their name and salary. Use Optional to handle the case when the list is empty.
        Optional<Employee> highestPaidEmployee = employees.stream()
                                                            .max(Comparator.comparingDouble(Employee::getSalary));
        highestPaidEmployee.ifPresent(e -> System.out.println(e.getName()));
    }
}
