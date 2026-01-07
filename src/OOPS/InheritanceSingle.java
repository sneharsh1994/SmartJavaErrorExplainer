package OOPS;
class Animal{
    void eat() {
        System.out.println("Eating....");
    }
}
class Dogs extends Animal{
    void bark(){
        System.out.println("Barking.....");
    }
}
public class InheritanceSingle {
    public static void main(String[]args) {
        Dogs d = new Dogs();
        d.bark();
        d.eat();
    }
}
