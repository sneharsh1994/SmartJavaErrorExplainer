package OOPS;
public class CohesionWeak {
    public void add(int x,int y){
        int sum=x+y;
        System.out.println(sum);
    }
    public void findVowel(char a){
        switch (a){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(a +"is a vowel");
                break;
            default:
                System.out.println(a +"is not a vowel");
        }
    }
    public static void main(String[]args){
        int x =9;
        int y=10;
        char c= 't';
        char d= 'o';
        CohesionWeak co=new CohesionWeak();
        co.add(x,y);
        co.findVowel(c);
        co.findVowel(d);
    }
}
