package OOPS;
class Calculation{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}
public class PolymorphismCompileTime {
    public static void main(String[]args){
        Calculation calc=new Calculation();
        System.out.println("Sum of Integers are:"+calc.add(60,40));
        System.out.println("SUm of Doubles are:"+calc.add(60.5,40.7));

    }

}
