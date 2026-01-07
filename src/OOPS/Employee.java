package OOPS;
class Main {
    //Fields(Instance Variables)
    int emp_id;
    String name;
    String dept;
    float salary;

    //Method to initialize the variable
    //fill the fields data
    void add_info(int id, String n, String d, float sal) {
        this.emp_id = id;
        this.name = n;
        this.dept = d;
        this.salary = sal;
    }

    //Method to display employee details
    void display() {
        System.out.println("Employee ID:" + emp_id);
        System.out.println("Employee Name:" + name);
        System.out.println("Employee Department:" + dept);
        System.out.println("Employee Salary:" + salary);
    }
}
public class Employee {
    public static void main(String[]args){
        Main e1=new Main();
        e1.add_info(101, "Peter", "Salesforce", 45000);
        Main e2=new Main();
        e2.add_info(201, "John", "Development", 70000);

        e1.display();
        e2.display();

    }
}
