package Praktikum6;

import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 
            System.out.println("----------------------------------");

            Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }
        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) menggunakan Bubble Sort:");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)"); 
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DECS): ");
        list.insertionSort();
        list.tampil();

       // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        //list.insertionSort();
        //list.tampil();

        sc.close();
    }
}
       // MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14();
        //Mahasiswa14 m1 = new Mahasiswa14("123", "Zidan", "2A", 3.2);
        //Mahasiswa14 m2 = new Mahasiswa14("124", "Ayu", "2A", 3.5);
        //Mahasiswa14 m3 = new Mahasiswa14("125", "Sofi", "2A", 3.1);
        //Mahasiswa14 m4 = new Mahasiswa14("126", "Sita", "2A", 3.9);
       // Mahasiswa14 m5 = new Mahasiswa14("127", "Miki", "2A", 3.7);

       // list.tambah(m1);
       // list.tambah(m2);
       // list.tambah(m3);
       // list.tambah(m4);
       // list.tambah(m5);

      
    