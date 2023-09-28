public class Bank {
    public static void main(String[] args) {

        AccountCreation ac = new AccountCreation();
        AccountClose acc_close = new AccountClose();

        Account savacc = ac.createAccount("Ramesh", 10000.00);
        Transaction txn = new Transaction();

        // acc_close.makeInActive(savacc);

        txn.ViewBalance(savacc);
        txn.deposit(savacc, 5000);
        txn.ViewBalance(savacc);
        txn.withdraw(savacc, 3000.00);
        txn.ViewBalance(savacc);
    }

}
