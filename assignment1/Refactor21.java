package javabasics.assignment1;


import java.util.*; // Unused import

public class Refactor21  {
    public String Name;
    public int age;
    public double Salary;
    public static double bonus = 0.1; // Should be constant

    public Refactor21(String n, int a, double s) {
        Name = n;
        age = a;
        Salary = s;
    }

    public void PrintDetails() {
        System.out.println("Name: " + Name + " Age: " + age + " Salary: " + Salary + " Bonus: " + (Salary * bonus));
    }

    public boolean equals(Object o) {
        Refactor21 e = (Refactor21) o; // Unsafe cast
        return Name.equals(e.Name) && age == e.age;
    }
}
/*
    private variable should not be exposed want to write setters and getters methods
    encapsulation  must performance

    don't import the unused packages it leads to low performance of the program
    import the specific class only
    import java.util.*; (wrong)
    import java.util.Scanner; (Right)

    Naming conventions must as per the rules
    like variable Name is wrong start with small letter like name
    like method name is PrintDetails (wrong) printDetails() right
 */
