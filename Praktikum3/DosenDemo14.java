package Praktikum3;

import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        int jumlahDosen;

        System.out.print("Masukkan jumlah dosen yang akan diinput: ");
        jumlahDosen = sc14.nextInt();
        sc14.nextLine();
        Dosen14[] arrayOfDosen = new Dosen14[jumlahDosen];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                   : ");
            kode = sc14.nextLine();
            System.out.print("Nama                   : ");
            nama = sc14.nextLine();
            System.out.print("Jenis Kelamin (P/L)    : ");
            char jk = sc14.nextLine().charAt(0);
            jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia                   : ");
            dummy = sc14.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");
            arrayOfDosen[i] = new Dosen14(kode, nama, jenisKelamin, usia);
        }
        for (Dosen14 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();  
        }
        DataDosen14 dataDosen = new DataDosen14();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        sc14.close();
        }
    }



