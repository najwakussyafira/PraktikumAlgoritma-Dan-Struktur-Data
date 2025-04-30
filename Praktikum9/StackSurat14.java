package Praktikum9;

public class StackSurat14 {
    Surat14[] stack;
    int top;
    int size;

    public StackSurat14(int size) {
        this.size = size;
        stack = new Surat14[size];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public void terimaSuratIzin(Surat14 surat) {
        if (isFull()) {
            System.out.println("Stack penuh, tidak bisa menerima lebih banyak surat izin.");
        } else {
            stack[++top] = surat;
            System.out.println("Surat izin berhasil diterima.");
        }
    }
    public Surat14 prosesSuratIzin() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        } else {
            Surat14 surat = stack[top--];
            System.out.println("Surat izin dari " + surat.namaMahasiswa + " telah diproses.");
            return surat;
        }
    }
    public Surat14 lihatSuratIzinTerakhir() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat izin yang diterima.");
            return null;
        } else {
            return stack[top];
        }
    }
    public void cariSuratIzin(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equals(namaMahasiswa)) {
                System.out.println("Surat izin ditemukan: " + stack[i].namaMahasiswa);
                return;
            }
        }
        System.out.println("Surat izin untuk " + namaMahasiswa + " tidak ditemukan.");
    }
}