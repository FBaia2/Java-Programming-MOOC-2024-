
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0.00);
        matthewsAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        System.out.println(matthewsAccount.toString()); 
       System.out.println(myAccount.toString()); 
        

    }
}
