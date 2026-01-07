package JavaPrograms;
public class Program2 {
    public static void main(String[]args){
        int n1=0,n2=1,n3,count=10,i;
        System.out.print(n1+" "+n2);//printing 0 and 1
        for( i=2;i<count;++i){//starting the loop from 2 as 0 and 1 is already printed
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;

        }


    }
}
