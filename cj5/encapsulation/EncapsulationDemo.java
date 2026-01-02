package javabasics.cj5.encapsulation;


class Employee {

    private String name;
    private double salary;
    private String empId;
    public String getName() {
        return name;
    }
    public void setEmpId(String empId) {
        this.empId=empId;
    }
    public String getEmpId(){
        return this.empId;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Rakesh");
        emp.setSalary(50000);
        emp.setEmpId("TECH2358");
        System.out.println(emp.getName() +" of EmId: "+emp.getEmpId()+ " and earns " + emp.getSalary());
    }
}

