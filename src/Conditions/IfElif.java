package Conditions;
public class IfElif {
    public static void main(String[]args){
        int marks=87;
        if(marks<50){
            System.out.println("Good");
        }
        else if((marks>50)&&(marks<70)){
            System.out.println("Excellent");
        }
        else{
            System.out.println("Outstanding");
        }
    }
}
