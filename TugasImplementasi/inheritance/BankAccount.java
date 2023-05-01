package TugasImplementasi.inheritance;

// Kelas induk untuk akun bank
class BankAccount {
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

    // Metode untuk tarik tunai
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Tarik tunai berhasil. Saldo baru: " + balance);
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    // Metode untuk cek saldo
    public void checkBalance() {
        System.out.println("Saldo akun: " + balance);
    }

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
