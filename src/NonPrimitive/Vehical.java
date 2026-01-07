package NonPrimitive;
 interface Vehical {
     void start();//method without body
}
class Car implements Vehical {
     public void start(){
         System.out.println("Car is starting...");
     }
     public static void main(String[]args){
         Car obj=new Car();
         obj.start();
     }

}
