package Praktikum3;

import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama;
        boolean jenisKelamin;
        int usia;

        // Minta input dari user untuk jumlah dosen yang akan dimasukkan
        System.out.print("Masukkan jumlah dosen yang akan diinput: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());

        // Membuat array of Dosen dengan jumlah sesuai input dari user
        Dosen14[] arrayOfDosen = new Dosen14[jumlahDosen];

        // Loop untuk memasukkan data dosen
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode             : ");
            kode = sc.nextLine();
            System.out.print("Nama             : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin    : ");
            jenisKelamin = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Usia             : ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("-----------------------------------");
            arrayOfDosen[i] = new Dosen14(kode, nama, jenisKelamin, usia);
        }
        // Menampilkan data dosen yang telah dimasukkan menggunakan looping foreach
        for (Dosen14 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();  // Memanggil method tampilkanInfo untuk setiap objek Dosen
        }
        }
    }



