import java.util.Scanner;

public class SIAKAD03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input data mahasiswa
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = input.nextLine();
        System.out.print("Masukkan nomor absen: ");
        int absen = input.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = input.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = input.nextDouble();
        
        // Menghitung nilai akhir
        double nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        
        // Menentukan nilai huruf dan kualifikasi
        String nilaiHuruf;
        String kualifikasi;
        double nilaiMutu;
        
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            nilaiMutu = 4.0;
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            nilaiMutu = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            nilaiMutu = 3.0;
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            nilaiMutu = 2.5;
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            nilaiMutu = 2.0;
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            nilaiMutu = 1.0;
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            nilaiMutu = 0.0;
            kualifikasi = "Gagal";
        }
        
        // Output hasil
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }    
}
