package Praktikum7;
import java.util.Scanner;
import Praktikum7.Mahasiswaberprestasi14;
import Praktikum7.Mahasiswa14;
public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();  
        sc.nextLine();

        Mahasiswaberprestasi14 list = new Mahasiswaberprestasi14();
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            
            System.out.println("----------------------------------");

        list.tambah (new Mahasiswa14(nim, nama, kelas, ipk));   
        }
        list.tampil();
        //melakukan pencarian data Binary
        System.out.println("---------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.println("IPK: ");
        String ipkInput = sc.nextLine();  
        double cari = Double.parseDouble(ipkInput); 
        System.out.println("--------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("----------------------------------");
        double posisi2 = list.findBinarySearch(cari,0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}
    

       //melakukan pencarian data sequential
       //System.out.println("---------------------------------------");
       //System.out.println("Pencarian data");
       //System.out.println("---------------------------------------");
       //System.out.println("masukkan ipk mahasiswa yang dicari: ");
       //System.out.println("IPK: ");
       //String ipkInput = sc.nextLine();
       //double cari =  Double.parseDouble(ipkInput); 

       //System.out.println("menggunakan sequential searching");
       //double posisi = list.sequentialSearching(cari);
       //int pss = (int)posisi;
       //list.tampilPosisi(cari, pss);
       //list.tampilDataSearch(cari, pss);
