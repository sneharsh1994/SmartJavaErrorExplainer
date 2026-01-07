package OOPS;
class Employe{
    float salary=50000;
}
class Programmer extends Employe{
    int bonus=10000;
}
public class Inheritance {
    public static void main(String[]args){
        Programmer p=new Programmer();
        System.out.println("Programmer's Salary:" +p.salary);
        System.out.println("Programmer's Bonus:" +p.bonus);

    }
}
