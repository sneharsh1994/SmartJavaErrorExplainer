package OOPS;
class Animalss{
    void eat(){
        System.out.println("Eating.....");
    }
}
class Dogss extends Animalss{
    void bark(){
        System.out.println("Barking.....");
    }
}
class Catss extends Animalss{
    void meow(){
        System.out.println("Meowing......");
    }
}
public class InheritanceHierarchical {
    public static void main(String[]args){
        Catss c=new Catss();
        c.eat();
        //c.bark();
        c.meow();
    }
}
