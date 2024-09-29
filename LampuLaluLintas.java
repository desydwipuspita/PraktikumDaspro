import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dari pengguna
        System.out.println("Masukkan warna lampu lalu lintas (merah, kuning, hijau): ");
        String lampu = scanner.nextLine();  // Mengambil input dari pengguna

        // Menggunakan switch-case untuk membandingkan string
        switch (lampu) {
            case "merah":
                System.out.println("Pengendara harus berhenti.");
                break;
            case "kuning":
                System.out.println("Pengendara harus berhati-hati atau mengurangi kecepatan.");
                break;
            case "hijau":
                System.out.println("Pengendara boleh berjalan.");
                break;
            default:
                System.out.println("Warna lampu tidak valid. Harap masukkan merah, kuning, atau hijau.");
                break;
        }
    }
}
