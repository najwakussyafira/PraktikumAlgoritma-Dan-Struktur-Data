import java.util.Scanner;

public class KodePlat14 {

    public static void main(String[] args) {
        // Array 1D 
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        // Array 2D
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        // Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Input kode plat nomor
            System.out.print("Masukkan kode plat nomor (misal: A, B, D, dll) atau ketik 'keluar' untuk berhenti: ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("keluar")) {
                System.out.println("Terima kasih, program selesai.");
                break; 
            }
            // Validasi input
            if (input.length() == 1) {
                char kode = input.charAt(0);
                
                // Mencari indeks kode plat nomor
                int index = -1;
                for (int i = 0; i < KODE.length; i++) {
                    if (KODE[i] == kode) {
                        index = i;
                        break;
                    }
                }

                // Menampilkan hasil
                if (index != -1) {
                    System.out.print("Kota untuk kode plat nomor " + kode + " adalah: ");
                    for (int i = 0; i < KOTA[index].length; i++) {
                        System.out.print(KOTA[index][i]);
                    }
                    System.out.println();
                } else {
                    System.out.println("Kode plat nomor tidak ditemukan.");
                }
            } else {
                System.out.println("Input tidak valid. Masukkan kode plat nomor yang benar.");
            }
        }

        scanner.close();
    }
}
