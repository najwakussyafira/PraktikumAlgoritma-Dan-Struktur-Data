package Praktikum5;

public class BruteForce14 {
     public static double calculateAverageUAS(Mahasiswa14[] mhs) {
        double total = 0;
        for (Mahasiswa14 mahasiswa : mhs) {
            total += mahasiswa.nilaiUAS;
        }
        return total / mhs.length;
    }
}
