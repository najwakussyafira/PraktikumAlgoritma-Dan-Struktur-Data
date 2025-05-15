package Praktikum10P1;
import java.util.Queue;
import java.util.Scanner;

public class QueueMain14 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("---------------");
    }
    public static void main(String[] args) {
    Scanner sc14 = new Scanner(System.in);
    System.out.print("Masukkan kapasitas queue: ");
    int n = sc14.nextInt();
    Queue14 Q = new Queue14(n);
    int pilih = 0;
    
    do {
        menu();
        pilih = sc14.nextInt();
        switch (pilih) {
            case 1:
            System.out.print("Masukkan data baru: ");
            int dataMasuk = sc14.nextInt();  
            Q.Enqueue(dataMasuk); 
            break;

            case 2:
                int dataKeluar = Q.Dequeue(); 
                if (dataKeluar != 0) {  
                    System.out.println("Data yang dikeluarkan: " + dataKeluar);
                break;
                }
            case 3:
                Q.print();
                break;

            case 4:
                Q.peek();
                break;

            case 5:
                Q.clear();
                break;
        }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    
    }
}
