import java.util.Scanner;

public class PemilihanBilangan03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        // Modifikasi dengan menggunakan ternary operator
        String hasil = (angka % 2 == 0) ? "Angka " + angka + " termasuk bilangan genap" : "Angka " + angka + " termasuk bilangan ganjil";

        System.out.println(hasil);
    }
}
