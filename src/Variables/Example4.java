package Variables;//---Overflow
public class Example4 {
    public static void main(String[]args){
        int a =130;
        byte b=(byte)a;//-----In Java Bytes can only store -128 to +127 values.
        System.out.println(a);
        System.out.println(b);
    }

}
