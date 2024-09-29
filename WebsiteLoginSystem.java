import java.util.Scanner;

public class WebsiteLoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "", password = "";

        // Cek apakah sudah memiliki akun
        System.out.print("Apakah Anda sudah memiliki akun? (yes/no): ");
        if (scanner.nextLine().equals("no")) {
            // Buat akun baru
            System.out.print("Buat username: ");
            username = scanner.nextLine();
            System.out.print("Buat password: ");
            password = scanner.nextLine();
            System.out.println("Akun berhasil dibuat!");
        }

        // Proses login
        while (true) {
            System.out.print("Masukkan username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login berhasil!");
                break;
            } else {
                System.out.println("Username atau password salah.");
            }
        }
    }
}
