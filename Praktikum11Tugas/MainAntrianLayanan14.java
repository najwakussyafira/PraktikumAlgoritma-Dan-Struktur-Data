package Praktikum11Tugas;
import java.util.Scanner;
public class MainAntrianLayanan14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antrian14 antrian = new Antrian14();

        int pilih;

        do {
            System.out.println("======= Menu Layanan Antrian Mahasiswa =======");
            System.out.println("1. Tambah Antrian Baru");
            System.out.println("2. memanggil Antrian");
            System.out.println("3. Lihat Mahasiswa Terdepan dan Terakhir");
            System.out.println("4. Tampilkan Jumlah Mahasiswa Dalam Antrian");
            System.out.println("5. Lihat Daftar Semua Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Cek Apakah Antrian Sudah Kosong");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu yang diinginkan: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan nama mahasiswa untuk mendaftar: ");
                    String nama = sc.nextLine();
                    antrian.tambahAntrian(nama);
                    break;

                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanTerdepanDanTerakhir();
                    break;
                case 4:
                    antrian.tampilkanJumlah();
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    antrian.kosongkanAntrian();
                    break;
                case 7:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian saat ini kosong.");

                    } else {
                        System.out.println("Masih ada mahasiswa dalam antrian.");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan.");
                    break;

                default:
                    System.out.println("Menu yang anda pilih tidak tersedia.");
                    break;
            }
        } while (pilih != 0);

        sc.close();

    }
}