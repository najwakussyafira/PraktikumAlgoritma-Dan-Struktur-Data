package Praktikum5;

public class MahasiswaMain14 {
    public static void main(String[] args) {
        Mahasiswa14[] mhs = new Mahasiswa14[] {
            new Mahasiswa14("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa14("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa14("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa14("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa14("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa14("Fajar", "220101006", 2022, 88, 85),
            new Mahasiswa14("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa14("Hadi", "220101008", 2020, 82, 84)
        };

        // Mencari nilai UTS tertinggi
        int maxUTS = DivideAndConquer14.findMaxUTS(mhs, 0, mhs.length - 1);
        System.out.println("Nilai UTS tertinggi: " + maxUTS);

        // Mencari nilai UTS terendah 
        int minUTS = DivideAndConquer14.findMinUTS(mhs, 0, mhs.length - 1);
        System.out.println("Nilai UTS terendah: " + minUTS);

        // Menghitung rata-rata UAS 
        double averageUAS = BruteForce14.calculateAverageUAS(mhs);
        System.out.println("Rata-rata nilai UAS: " + averageUAS);
    }
}
    
