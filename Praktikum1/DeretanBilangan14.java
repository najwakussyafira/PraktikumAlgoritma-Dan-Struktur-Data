import java.util.Scanner;

public class DeretanBilangan14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        // Input NIM
        System.out.print("Masukkan NIM: ");
        String nim = sc14.nextLine();

        // Ambil 2 digit terakhir dari NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }
        System.out.println("=====================================");
        System.out.println("n : " + n);
        // Perulangan untuk menampilkan deretan angka
        for (int i = 1; i <= n; i++) {
            // Lewati angka 6 dan 10
            if (i == 6 || i == 10) {
                continue;
            }
            // Jika angka ganjil, cetak dengan simbol asterisk
            if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                // Jika angka genap, cetak angka aslinya
                System.out.print(i + " ");
            }
        }
        sc14.close();
    }
}

