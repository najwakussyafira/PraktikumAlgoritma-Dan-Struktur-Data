import java.util.Scanner;

public class NilaiMahasiswapdf {
    
    // Fungsi untuk menghitung rata-rata nilai mahasiswa
    public static double hitungRataRata(int[] nilai, int jumlahMataKuliah) {
        int totalNilai = 0;
        for (int j = 0; j < jumlahMataKuliah; j++) {
            totalNilai += nilai[j];
        }
        return totalNilai / (double) jumlahMataKuliah;
    }

    // Fungsi untuk menentukan status kelulusan mahasiswa
    public static String tentukanStatusKelulusan(double rataRata) {
        if (rataRata >= 75) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        
        // Deklarasi variabel
        int jumlahMahasiswa, jumlahMataKuliah;
        
        // Input jumlah mahasiswa dan jumlah mata kuliah
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc15.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMataKuliah = sc15.nextInt();
        
        // Deklarasi array untuk nilai mahasiswa, rata-rata dan status kelulusan
        int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];
        double[] rataRata = new double[jumlahMahasiswa];
        String[] statusLulus = new String[jumlahMahasiswa];
        
        // Input nilai untuk setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai untuk mahasiswa " + (i+1) + ": ");
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc15.nextInt();
            }
            // Hitung rata-rata nilai dengan fungsi
            rataRata[i] = hitungRataRata(nilai[i], jumlahMataKuliah);
            
            // Tentukan status kelulusan dengan fungsi
           rataRata[i] = hitungRataRata(nilai[i], jumlahMataKuliah);
        }
        
        // Output rata-rata dan status kelulusan
        System.out.println("\nHasil Kelulusan Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa " + (i+1) + ": Rata-rata = " + rataRata[i] + ", Status = " + statusLulus[i]);
        }
        
        sc15.close();
    }
}
