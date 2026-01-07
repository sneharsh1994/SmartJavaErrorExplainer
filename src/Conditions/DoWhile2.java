package Conditions;
public class DoWhile2 {
    public static void main(String[]args){
        int n=5;
        int f=1;
        int i=1;
        do{
            f*=i;
            i++;
        }while(i<=n);
        System.out.println("Factorial of " +n+" is: " +f);
    }
}
