package Praktikum3;

public class Dosen14 {
         String kode;
         String nama;
         Boolean jenisKelamin;
         int usia;
    
        // Constructor untuk menginisialisasi objek Dosen
        public Dosen14(String kode, String nama, Boolean jenisKelamin, int usia) {
            this.kode = kode;
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.usia = usia;
        }
    
        // Method untuk menampilkan informasi tentang dosen
        public void tampilkanInfo() {
            System.out.println("Kode          : " + this.kode);
            System.out.println("Nama          : " + this.nama);
            System.out.println("Jenis Kelamin : " + (this.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + this.usia);
            System.out.println("-----------------------------------");
        }
    }
    
