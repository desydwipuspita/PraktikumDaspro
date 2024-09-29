import java.util.Scanner;

public class SistemParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = scanner.nextLine();

        int biayaPerJam;

        if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            biayaPerJam = 5000;
        } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
            biayaPerJam = 3000;
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
            return; // Keluar dari program jika input tidak valid
        }

        System.out.println("Total biaya parkir selama 1 jam untuk " + jenisKendaraan + ": Rp " + biayaPerJam);


    }
}