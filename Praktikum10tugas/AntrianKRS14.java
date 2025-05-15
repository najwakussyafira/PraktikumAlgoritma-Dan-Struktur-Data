package Praktikum10tugas;

public class AntrianKRS14 {
    Mahasiswa14[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianKRS14(int max) {
        this.max = max;
        this.data = new Mahasiswa14[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa14 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambahkan mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk antrian.");
    }

    public Mahasiswa14[] ambilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa14[] mhsPasangan = new Mahasiswa14[2];
        mhsPasangan[0] = data[front];
        mhsPasangan[1] = data[(front + 1) % max];

        front = (front + 2) % max;
        size -= 2;

        System.out.println("Mahasiswa yang diproses untuk KRS: ");
        mhsPasangan[0].tampilkanData();
        mhsPasangan[1].tampilkanData();
        return mhsPasangan;
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan:");
            data[front].tampilkanData();
            if (size > 1) {
                data[(front + 1) % max].tampilkanData();
            }
        }
    }

    public void lihatTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir:");
            data[rear].tampilkanData();
        }
    }
    public int getJumlahAntrian() {
        return size;
    }
}