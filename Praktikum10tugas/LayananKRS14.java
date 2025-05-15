package Praktikum10tugas;
import java.util.Scanner;
public class LayananKRS14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS14 antrian = new AntrianKRS14(10); 
        int pilihan;

        do {
            System.out.println("\n=== Menu Layanan Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Terakhir");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa14 mhs = new Mahasiswa14(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.ambilAntrian();
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    break;

                case 4:
                    antrian.lihatTerakhir();
                    break;

                case 5:
                    antrian.tampilkanSemua();
                    break;

                case 6:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}
    
