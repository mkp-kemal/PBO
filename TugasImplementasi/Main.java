package TugasImplementasi;

import java.util.ArrayList;

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

// Contoh penggunaan kelas-kelas di atas
public class Main {
    public static void main(String[] args) {
        // Membuat objek-objek akun tabungan dan giro
        SavingsAccount savings = new SavingsAccount(123456, "Kemal Pasha", 1000);
        CheckingAccount checking = new CheckingAccount(789012, "Budiman", 2000);

        // Memanggil metode deposit() pada objek-objek akun
        savings.deposit(500);
        checking.deposit(1000);

        // Memanggil metode withdraw() pada objek-objek akun
        savings.withdraw(200);
        checking.withdraw(1500);

        // Memanggil metode checkBalance() pada objek-objek ak
        savings.checkBalance();
        checking.checkBalance();

// Memanggil metode printAccountInfo() pada objek-objek akun
        savings.printAccountInfo();
        checking.printAccountInfo();
    }
}
