package OOPS;
public class Math {
    //Instance Variable
    int a;
    int b;

    //Constructor
    public Math(int x,int y){
        this.a=x;
        this.b=y;
    }
    //Methods
    public int add(){
        int res=a+b;
        return res;
    }
    public int sub(){
        int res=a-b;
        return res;
    }
    public int multiply(){
        int res=a*b;
        return res;
    }
    public int divide(){
        int res =a/b;
        return res;
    }
    //Main Method
    public static void main(String[]args){
        Math myNum=new Math(45,4);
        System.out.println("Addition :"+myNum.add());
        System.out.println("Subtraction :"+myNum.sub());
        System.out.println("Multiplication :"+myNum.multiply());
        System.out.println("Division :"+myNum.divide());
    }
}
