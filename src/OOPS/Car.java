package OOPS;
public class Car {
    private String brand;
    private String model;
    private int year;

    //Constructor
    public Car(String brand,String model,int year){
        this.brand=brand;  // this is used----- to assign the parameter to the object’s field with the same name.
        this.model=model;
        this.year=year;
    }
    //Getter Method -----To Read Values   ------ Returns the current values of the private fields
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    //Setter Method -----To Change Values   ----- If someone changes the value it updates the new one
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }

    //Main Method
    public static void main(String[]args){
        Car myCar = new Car ("Toyota","Camry",2020);
        System.out.println("Brand:" + myCar.getBrand());
        System.out.println("Model:" + myCar.getModel());
        System.out.println("Year:" + myCar.getYear());


        myCar.setYear(2022);
        System.out.println("Updated Year: " + myCar.getYear());
    }




}
