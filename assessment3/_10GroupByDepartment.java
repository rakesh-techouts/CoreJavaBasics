package javabasics.assessment3;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class _10GroupByDepartment {
    static void main() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Rakesh", "CSE"));
        employeeList.add(new Employee("Vikas", "CSE"));
        employeeList.add(new Employee("Ram", "EEE"));
        employeeList.add(new Employee("Vikki", "ECE"));
        employeeList.add(new Employee("Varma", "CSE"));

        Map<String, Long> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(map);
    }
}
