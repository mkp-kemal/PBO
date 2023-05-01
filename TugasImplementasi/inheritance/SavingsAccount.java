package TugasImplementasi.inheritance;

// Kelas turunan untuk akun tabungan
class SavingsAccount extends BankAccount {
    // Konstruktor
    public SavingsAccount(int accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
    }

    // Implementasi metode withdraw() untuk tabungan
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Tarik tunai berhasil. Saldo baru: " + balance);
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    // Implementasi metode checkBalance() untuk tabungan
    public void checkBalance() {
        System.out.println("Saldo tabungan: " + balance);
    }
}
