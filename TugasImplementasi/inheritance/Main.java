package TugasImplementasi.inheritance;






// Contoh penggunaan kelas-kelas di atas
public class Main {
    public static void main(String[] args) {
        // Membuat objek-objek akun tabungan dan giro
        SavingsAccount savings = new SavingsAccount(123456, "Kemal", 1000);
        CheckingAccount checking = new CheckingAccount(789012, "John", 2000);

        // Memanggil metode deposit() pada objek-objek akun
        savings.deposit(500);
        checking.deposit(1000);
        // Memanggil metode withdraw() pada objek-objek akun
        savings.withdraw(200);
        checking.withdraw(3000);

// Memanggil metode checkBalance() pada objek-objek akun
        savings.checkBalance();
        checking.checkBalance();

// Memanggil metode printAccountInfo() pada objek-objek akun
        savings.printAccountInfo();
        checking.printAccountInfo();
    }
}

