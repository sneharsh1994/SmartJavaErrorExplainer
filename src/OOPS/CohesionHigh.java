package OOPS;
class Number{
    public void add(int x,int y){
        int sum=x+y;
        System.out.println(sum);
    }
}
class Character{
    public void findVowel(char a){
        switch (a){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(a + "is a vowel");
                break;
            default:
                System.out.println(a + "is not a vowel");
        }
    }
}
public class CohesionHigh {
    public static void main(String[]args){
        Number n=new Number();
        Character ch=new Character();
        int x =9;
        int y=10;
        char c= 't';
        char d= 'o';
        n.add(x,y);
        ch.findVowel(c);
        ch.findVowel(d);




    }
}
