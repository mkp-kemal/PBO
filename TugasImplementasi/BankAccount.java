package TugasImplementasi;

// Kelas abstract untuk akun bank
abstract class BankAccount {
    // Properti
    private int accountNumber;
    private String accountName;
    protected double balance;

    // Konstruktor
    public BankAccount(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    // Metode abstrak untuk tarik tunai
    public abstract void withdraw(double amount);

    // Metode abstrak untuk cek saldo
    public abstract void checkBalance();

    // Metode untuk setor tunai
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Setor tunai berhasil. Saldo baru: " + balance);
    }

    // Metode untuk mencetak informasi akun
    public void printAccountInfo() {
        System.out.println("Nomor akun: " + accountNumber);
        System.out.println("Nama akun: " + accountName);
        System.out.println("Saldo akun: " + balance);
    }
}

