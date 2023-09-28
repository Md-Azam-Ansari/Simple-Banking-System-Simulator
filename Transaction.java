public class Transaction {

    public void ViewBalance(Account acc) {
        if (acc.getActive()) {
            System.out.println("Account Balance: " + acc.getAccbal());
        } else {
            System.out.println("Failed to view balance, account is inactive");
        }
    }

    public void deposit(Account acc, double amount) {
        if (acc.getActive()) {
            System.out.println("Depositing Rs " + amount);
            acc.setAccbal(acc.getAccbal() + amount);
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Failed to Deposit, Account inactive");
        }
    }

    public void withdraw(Account acc, double amount) {
        if (acc.getActive()) {
            System.out.println("Withdrawing Rs " + amount);
            if (amount < acc.getAccbal()) {
                acc.setAccbal(acc.getAccbal() - amount);
                System.out.println("Withdraw Successfull");
            } else {
                System.out.println("Withdraw failed, due to insufficient balance");
            }
        } else {
            System.out.println("Failed to withdraw, Account in-active");
        }

    }
}
