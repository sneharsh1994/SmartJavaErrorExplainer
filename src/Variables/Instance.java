package Variables;
class Main {
    public String name;//------instance variable
    public int age=20;
    public Main(){
        this.name="Sneha";
    }
}
public class Instance{
    public static void main(String []args){
        Main obj=new Main();
        System.out.println("Student Name is:"+obj.name);
        System.out.println("Age:"+obj.age);
    }
}



