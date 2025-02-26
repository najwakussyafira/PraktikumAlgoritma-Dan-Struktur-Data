package Praktikum3;
import java.util.Scanner;
public class MatakuliahDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matakuliah yang akan diinput: ");
        int jumlahMatakuliah = sc.nextInt();
        sc.nextLine();
        Matakuliah14[] arrayOfMatakuliah = new Matakuliah14[jumlahMatakuliah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");

            // Menggunakan method tambahData() untuk menambahkan data
            arrayOfMatakuliah[i] = new Matakuliah14(kode, nama, sks, jumlahJam);
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }
        
         // Menampilkan data yang telah dimasukkan menggunakan method cetakInfo
         for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();  // Memanggil method cetakInfo() untuk menampilkan data

    }
    sc.close();
}
}

