package ch10;

public class AccountExample {
    public static void main(String[] args) {
        
        try {
            Account account = new Account();

            account.deposit(10000);
            System.out.println("예금액: " + account.getBalance());

            account.withdraw(30000);
        } catch (BalanceInsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        }
        
    }
}
