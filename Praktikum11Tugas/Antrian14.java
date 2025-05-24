package Praktikum11Tugas;

public class Antrian14 {
    Node14 front,rear;
    int jumlah;

    public Antrian14() {
        front = null;
        rear = null;
        jumlah = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void tambahAntrian(String nama) {
        Node14 baru = new Node14(nama);

        if (rear == null) {
            front = baru;
            rear = baru;

        } else {
            rear.next = baru;
            rear = baru;
        }

        jumlah++;
        System.out.println(nama + " masuk ke dalam antrian.");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dapat dilayani.");

        } else {
            System.out.println("memanggil: " + front.nama);
            front = front.next;

            if (front == null) {
                rear = null;

            }

            jumlah--;
        }
    }

    public void tampilkanTerdepanDanTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");

        } else {
            System.out.println("Antrian terdepan: " + front.nama);
            System.out.println("Antrian terbelakang: " + rear.nama);

        }
    }

    public void tampilkanJumlah() {
        System.out.println("Jumlah mahasiswa yang masih mengantri: " + jumlah);
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");

        } else {
            System.out.println("Daftar mahasiswa dalam antrian:");
            Node14 bantu = front;
            int nomor = 1;
            while (bantu != null) {
                System.out.println(nomor + ". " + bantu.nama);
                bantu = bantu.next;
                nomor++;

            }
        }
    }

    public void kosongkanAntrian() {
        front = null;
        rear = null;
        jumlah = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

}