
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        Account newAccount = new Account("Matthews account",1000.00);
        Account newAccount2 = new Account("My account",0.00);
        newAccount.withdrawal(100.00);
        newAccount2.deposit(100.00);
        System.out.println(newAccount);
        System.out.println(newAccount2);
    }
}
