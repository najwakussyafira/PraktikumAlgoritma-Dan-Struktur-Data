package Praktikum6;
import java.util.Scanner;

public class DosenMain14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        DataDosen14 list = new DataDosen14(10);
        int pilihan;

        do {
            System.out.println("========== MENU ==========");
            System.out.println("1) Tambah Data Dosen");
            System.out.println("2) Tampilkan Data Dosen");
            System.out.println("3) Sorting ASC (Termuda - Tertua)");
            System.out.println("4) Sorting DSC (Tertua - Termuda)");
            System.out.println("5) Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc14.nextInt();
            sc14.nextLine();

            switch (pilihan) {
                case 1:
                    if (list.idx < 10) {
                        System.out.println("Masukkan Data Dosen ke-" + (list.idx + 1));
                        System.out.print("Kode Dosen            : ");
                        String kode = sc14.nextLine();
                        System.out.print("Nama                  : ");
                        String nama = sc14.nextLine();
                        System.out.print("Jenis Kelamin (LK/PR) : ");
                        String jenisKelamin = sc14.nextLine();
                        System.out.print("Usia                  : ");
                        int usia = sc14.nextInt();
                        sc14.nextLine();

                        Dosen14 m = new Dosen14(kode, nama, jenisKelamin, usia);
                        list.tambah(m);
                        System.out.println("Data dosen berhasil ditambahkan");
                    } else {
                        System.out.println("Kapasitas data sudah penuh! (Max 10 dosen)");
                    }
                    break;

                case 2:
                    if (list.idx == 0) {
                        System.out.println("Belum ada data dosen yang tersimpan");
                    } else {
                        System.out.println("========== Data Dosen ==========");
                        list.tampil();
                    }
                    break;

                case 3:
                    System.out.println("===== Data dosen Sorting ASC =====");
                    list.sortingASC();
                    list.tampil();
                    break;

                case 4:
                    System.out.println("===== Data dosen Sorting DSC =====");
                    list.sortingDSC();
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Anda telah keluar dari program");
                    break;

                default:
                    System.out.println("Pilihan  yang Anda masukkan tidak valid! Silakan pilih menu yang tersedia.");
            }
        } while (pilihan != 5);

        sc14.close();
    }
}