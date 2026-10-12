public class BankAccount {


    private String ownerName;

    private double balance;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Баланс не может быть отрицательным");
        } else {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(500);
        account.setBalance(-1000);

        System.out.println(account.getBalance());

    }
}

