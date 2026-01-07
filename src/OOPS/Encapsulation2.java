package OOPS;
class Account{
    private long acc_no;
    private String name,email;
    private float amount;

    public long getAcc_no(){
        return acc_no;
    }
    public void setAcc_no(long acc_no){
        this.acc_no=acc_no;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email ){
        this.email=email;
    }
    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }
    public String getName(){
        return name;
    }
    public void setName(String name ){
        this.name=name;
    }
}
public class Encapsulation2 {
    public static void main(String[]args){
        Account a=new Account();
        a.setAcc_no(7560504000L);
        a.setEmail("sneha@gmail.com");
        a.setName("Sneha");
        a.setAmount(500000f);

        System.out.println(a.getAcc_no());
        System.out.println(a.getEmail());
        System.out.println(a.getName());
        System.out.println(a.getAmount());
    }
}
