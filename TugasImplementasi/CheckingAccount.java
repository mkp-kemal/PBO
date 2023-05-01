package TugasImplementasi;

// Kelas turunan untuk akun giro
class CheckingAccount extends BankAccount {
    // Konstruktor
    public CheckingAccount(int accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
    }

    // Implementasi metode withdraw() untuk giro
    public void withdraw(double amount) {
        double totalBalance = balance - amount;
        if (totalBalance >= -1000) {
            balance -= amount;
            System.out.println("Tarik tunai berhasil. Saldo baru: " + balance);
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    // Implementasi metode checkBalance() untuk giro
    public void checkBalance() {
        System.out.println("Saldo giro: " + balance);
    }
}

