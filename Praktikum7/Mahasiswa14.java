package Praktikum7;

public class Mahasiswa14 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor Default 
    Mahasiswa14() {
    }

    // Konstructor berparameter
    Mahasiswa14(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }
    
    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
       
    }
}


