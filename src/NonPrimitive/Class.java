package NonPrimitive;
class Class {
    int a=10;
    String b="Sneha";
    void display(){ //Method
        System.out.println("Number:"+a);
        System.out.println("Name:"+b);
    }
    public static void main(String[]args){
        Class obj=new Class();
        obj.a=10;
        obj.b="Sneha";
        obj.display();
    }
}
