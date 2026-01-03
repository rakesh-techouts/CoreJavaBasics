package javabasics.assignment1;

import java.util.Objects;

/**
 * Represents an Employee with name, age, and salary.
 * SonarLint-compliant version with proper encapsulation and best practices.
 */
public class Refactor {

    private static final double BONUS_RATE = 0.10; // Constant for bonus calculation

    private String name;
    private int age;
    private double salary;

    public Refactor(String name, int age, double salary) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * BONUS_RATE;
    }

    public void printDetails() {
        System.out.printf("Name: %s | Age: %d | Salary: %.2f | Bonus: %.2f%n",
                name, age, salary, calculateBonus());
    }
}
