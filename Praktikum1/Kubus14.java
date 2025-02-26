import java.util.Scanner;

public class Kubus14 {

    // Fungsi untuk menghitung volume kubus
    public static double hitungVolumeKubus(double s) {
        return s * s * s;  // Volume = s^3
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static double hitungLuasPermukaanKubus(double s) {
        return 6 * (s * s);  // Luas permukaan = 6 * s^2
    }

    // Fungsi untuk menghitung keliling kubus
    public static double hitungKelilingKubus(double s) {
        return 12 * s;  // Keliling = 12 * s
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menampilkan menu pilihan
            System.out.println("\nPilih rumus yang ingin dihitung:");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1/2/3/4): ");
            int pilihan = scanner.nextInt();

            // Jika memilih keluar, keluar dari perulangan
            if (pilihan == 4) {
                System.out.println("Terima kasih, program selesai.");
                break;
            }

            // Meminta input panjang rusuk kubus
            System.out.print("Masukkan panjang rusuk kubus (s): ");
            double s = scanner.nextDouble();

            // Variabel untuk menyimpan hasil perhitungan
            double hasil = 0;

            // Menentukan aksi berdasarkan pilihan
            switch (pilihan) {
                case 1:
                    hasil = hitungVolumeKubus(s);
                    System.out.println("Volume kubus adalah: " + hasil);
                    break;
                case 2:
                    hasil = hitungLuasPermukaanKubus(s);
                    System.out.println("Luas permukaan kubus adalah: " + hasil);
                    break;
                case 3:
                    hasil = hitungKelilingKubus(s);
                    System.out.println("Keliling kubus adalah: " + hasil);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}
