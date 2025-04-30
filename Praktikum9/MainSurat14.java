package Praktikum9;

import java.util.Scanner;

public class MainSurat14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat14 stack = new StackSurat14(5);  // Max 5 Surat
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Masukkan Jenis Izin (S/I): ");
                    char jenisIzin = scan.next().charAt(0);
                    System.out.print("Masukkan Durasi Izin: ");
                    int durasi = scan.nextInt();
                    Surat14 surat = new Surat14(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.terimaSuratIzin(surat);
                    break;

                case 2:
                    stack.prosesSuratIzin();
                    break;

                case 3:
                    Surat14 terakhir = stack.lihatSuratIzinTerakhir();
                    if (terakhir != null) {
                        System.out.println("Surat Izin Terakhir: " + terakhir.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Mahasiswa untuk mencari Surat Izin: ");
                    String namaCari = scan.nextLine();
                    stack.cariSuratIzin(namaCari);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);

        scan.close();
    }
}
    
