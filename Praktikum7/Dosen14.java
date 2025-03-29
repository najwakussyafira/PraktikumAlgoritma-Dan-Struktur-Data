package Praktikum7;

public class Dosen14 {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    Dosen14(String kd, String name, String jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin (LK/PR): " + (jenisKelamin.equalsIgnoreCase("LK") ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + usia);
        System.out.println("---------------------------");

    }
}

