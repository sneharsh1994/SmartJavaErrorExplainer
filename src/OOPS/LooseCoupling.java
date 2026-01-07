package OOPS;
class Aa{
    void foo(){
        System.out.println("Foo");
    }
}
class Bb extends A{
    void foo(){
        System.out.println("Foo1");
    }
}
public class LooseCoupling {
    public static void main(String[]args){
        Bb b=new Bb();
        b.foo();
    }
}
