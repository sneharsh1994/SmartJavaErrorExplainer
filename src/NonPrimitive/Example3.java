package NonPrimitive;
public class Example3 {
    public static void main(String[]args){
        String letter="Dear <|name|>, Thanks a lot";
       // System.out.println(letter);
        String a=letter.replace("<|name|>", "Harsh");
        System.out.println(a);

    }
}