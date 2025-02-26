import java.util.Scanner;

public class NilaiMahasiswa14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        // Input nilai komponen
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=============================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc14.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc14.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc14.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc14.nextInt();

        // Validasi nilai
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("=====================================");
            System.out.println("=====================================");
            System.out.println("nilai tidak valid");
            System.out.println("=====================================");
            System.out.println("=====================================");
            return;
        }

        // Hitung nilai akhir
        double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.4);
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        // Konversi nilai akhir ke huruf
        String grade = "";
        if (nilaiAkhir >= 80) grade = "A";
        else if (nilaiAkhir >= 73) grade = "B+";
        else if (nilaiAkhir >= 65) grade = "B";
        else if (nilaiAkhir >= 60) grade = "C+";
        else if (nilaiAkhir >= 50) grade = "C";
        else if (nilaiAkhir >= 39) grade = "D";
        else grade = "E";

        // Output nilai huruf dan status kelulusan
        System.out.println("Nilai Huruf: " + grade);
        System.out.println("=====================================");
        System.out.println("=====================================");

        if (grade.equals("A") || grade.equals("B+") || grade.equals("B") || grade.equals("C+") || grade.equals("C")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
       sc14.close();
    }
}
