package Conditions;
public class ForLoop2 {
    public static void main(String[]args){
        int n=5;
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        System.out.println("Factorial is:"+f);
    }
}
//i=1->factorial=1*1=1
//i=2->factorial=1*2=2
//i=3->factorial=2*3=6
//i=4->factorial=6*4=24
//i=5->factorial=24*5=120
