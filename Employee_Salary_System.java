class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    double salary;
    
    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Employee_Salary_System {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, 50000);
        emp.displayDetails();
    }
}