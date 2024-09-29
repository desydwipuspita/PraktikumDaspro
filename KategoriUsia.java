import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int usia;

        do {
            System.out.print("Masukkan usia Anda: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input harus berupa angka. Silakan masukkan ulang.");
                scanner.next();
            }
            usia = scanner.nextInt();
            if (usia < 0) {
                System.out.println("Usia tidak boleh negatif. Silakan masukkan ulang.");
            }
        } while (usia < 0);

        String kategori;
        if (usia <= 12) {
            kategori = "Anak";
        } else if (usia <= 19) {
            kategori = "Remaja";
        } else if (usia <= 64) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

        System.out.println("Usia anda termasuk dalam kategori: " + kategori);
    }
}