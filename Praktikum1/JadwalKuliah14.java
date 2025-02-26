import java.util.Scanner;

public class JadwalKuliah14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mata kuliah yang akan dimasukkan
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline yang tertinggal

        // Array untuk menyimpan data mata kuliah
        String[] namaMataKuliah = new String[n];
        int[] SKS = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        // Input data mata kuliah
        for (int i = 0; i < n; i++) {
            System.out.println("\nMata kuliah " + (i + 1) + ":");

            System.out.print("Nama mata kuliah: ");
            namaMataKuliah[i] = scanner.nextLine();

            System.out.print("SKS: ");
            SKS[i] = scanner.nextInt();

            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            System.out.print("Hari kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        // Menu pilihan
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Menampilkan seluruh jadwal kuliah");
            System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Mencari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1/2/3/4/5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    // Menampilkan seluruh jadwal kuliah
                    System.out.println("\nSeluruh Jadwal Kuliah:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(namaMataKuliah[i] + " | SKS: " + SKS[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                    }
                    break;

                case 2:
                    // Menampilkan jadwal kuliah berdasarkan hari tertentu
                    System.out.print("\nMasukkan hari yang ingin ditampilkan (misalnya 'Senin'): ");
                    String hari = scanner.nextLine();
                    boolean ditemukanHari = false;
                    System.out.println("\nJadwal Kuliah Hari " + hari + ":");
                    for (int i = 0; i < n; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(hari)) {
                            System.out.println(namaMataKuliah[i] + " | SKS: " + SKS[i] + " | Semester: " + semester[i]);
                            ditemukanHari = true;
                        }
                    }
                    if (!ditemukanHari) {
                        System.out.println("Tidak ada jadwal kuliah pada hari " + hari + ".");
                    }
                    break;

                case 3:
                    // Menampilkan jadwal kuliah berdasarkan semester tertentu
                    System.out.print("\nMasukkan semester yang ingin ditampilkan: ");
                    int semesterInput = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline
                    boolean ditemukanSemester = false;
                    System.out.println("\nJadwal Kuliah Semester " + semesterInput + ":");
                    for (int i = 0; i < n; i++) {
                        if (semester[i] == semesterInput) {
                            System.out.println(namaMataKuliah[i] + " | SKS: " + SKS[i] + " | Hari: " + hariKuliah[i]);
                            ditemukanSemester = true;
                        }
                    }
                    if (!ditemukanSemester) {
                        System.out.println("Tidak ada jadwal kuliah di semester " + semesterInput + ".");
                    }
                    break;

                case 4:
                    // Mencari mata kuliah berdasarkan nama
                    System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
                    String namaCari = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (namaMataKuliah[i].equalsIgnoreCase(namaCari)) {
                            System.out.println("\nMata Kuliah Ditemukan:");
                            System.out.println("Nama: " + namaMataKuliah[i]);
                            System.out.println("SKS: " + SKS[i]);
                            System.out.println("Semester: " + semester[i]);
                            System.out.println("Hari: " + hariKuliah[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("\nMata kuliah tidak ditemukan.");
                    }
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("Terima kasih, program selesai.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
                    break;
            }
        }
    }
}
