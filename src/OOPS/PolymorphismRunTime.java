package OOPS;
class Bike{
    void run(){
        System.out.println("Running......");
    }
}
class Splendor extends Bike{
    void run(){
        System.out.println("Running Safety....");
    }
}
public class PolymorphismRunTime {
    public static void main(String[]args){
        Bike b=new Splendor();//-------(parent reference, child object)
        b.run();
    }

}
