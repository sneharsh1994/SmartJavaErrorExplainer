package NonPrimitive;
public class Example4 {
    public static void main(String[]args){
        String text="This  is a test  string";
        if (text.contains("  ")){
            System.out.println("Double space found");
        }
        else{
            System.out.println("No double space found");
        }
        if(text.contains("   ")){
            System.out.println("triple space found");
        }
        else{
            System.out.println("No triple space found");
        }
    }

}
