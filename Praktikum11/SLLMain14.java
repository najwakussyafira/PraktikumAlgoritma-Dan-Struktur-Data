package Praktikum11;
import java.util.Scanner;

public class SLLMain14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    SingleLinkedList14 sll = new SingleLinkedList14();

    System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println("==== DATA MAHASISWA ===");
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("NIM     : ");
            String nim = sc.nextLine();
            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK     : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa14 mhs = new Mahasiswa14(nama, nim, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println();
        System.out.println("data index 1 :");
        sll.getData(0);

        System.out.println("data mahasiswa an Bimon berada pada index : " + (sll.indexOf("Bimon") + 1)); 

        System.out.println();
        sll.print();

        sll.removeFirst();
        System.out.println();
        sll.print();
        sc.close();
    }
}