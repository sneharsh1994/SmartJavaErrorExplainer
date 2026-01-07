package OOPS;
//Single Inheritance-------Super Class
class C{
    public void disp(){
        System.out.println("C");
    }
}
//SIngle Inheritance------Sub Class
class A extends C{
    public void disp(){
        System.out.println("A");
    }
}
//Hierarchical Inheritance
class B extends C{
    public void disp(){
        System.out.println("B");
    }
}
//Multi Level Inheritance
public class InheritanceHybrid extends A{
    public void disp(){
        System.out.println("D");
    }
    public static void main(String[]args){
        InheritanceHybrid d=new InheritanceHybrid();
        d.disp();
    }
}
