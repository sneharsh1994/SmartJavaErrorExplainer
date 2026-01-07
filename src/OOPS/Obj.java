package OOPS;
class Dog {
    String name;          //Instance variable
    void bark() {         //Method named bark and return nothing as void
        System.out.println(name + " says woof!");           //Dogs name followed by the text
    }
}
public class Obj{
    public static void main(String []args){
        Dog mydog=new Dog();         //Object creation
        mydog.name="Rocky";          //Set Dogs name
        mydog.bark();                //Calls the bark method on myDog 

}

}
