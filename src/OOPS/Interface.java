package OOPS;
interface Person{
    void display();//----public & abstract method by default
}
class Student implements Person{
    public void display(){//------public because interface method is public
        System.out.println("Student");
    }
}
class Teacher implements Person{
    public void display(){
        System.out.println("Teacher");
    }
}
public class Interface {
    public static void main(String[]args){
        Person p1=new Student();//-----Variable type Person but Object is Student
        p1.display();
        Person p2=new Teacher();//----Variable type Person but Object is Teacher
        p2.display();
    }
}
