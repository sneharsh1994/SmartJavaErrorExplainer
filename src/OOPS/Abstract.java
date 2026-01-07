package OOPS;
abstract class Animal1{ //------Abstract Class->Object cannot be created directly.
    abstract void makeSound();//-----Abstract Method->As declared inside abstract class
    void eat(){//-----Normal Method
        System.out.println("I can eat");
    }
}
class Doga extends Animal1{
    void makeSound(){//Overrides abstract method otherwise it will also declared as abstract class
        System.out.println("bark bark");
    }
}
public class Abstract {
    public static void main(String[]args){
        Doga d=new Doga();
        d.makeSound();
        d.eat();

    }
}
