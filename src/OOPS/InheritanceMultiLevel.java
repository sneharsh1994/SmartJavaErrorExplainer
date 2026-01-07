package OOPS;
class Animals{
    void eat() {
        System.out.println("Eating....");
    }
}
class Cat extends Animal{
    void sleep(){
        System.out.println("Sleeping.....");
    }
}
class BabyCat extends Cat{
    void weep(){
        System.out.println("Weeping....");
    }
}
public class InheritanceMultiLevel {
    public static void main(String[]args) {
        BabyCat d = new BabyCat();
        d.sleep();
        d.eat();
        d.weep();
    }
}


