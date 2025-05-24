package Praktikum11;

public class Mahasiswa14 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa14() {}

    public Mahasiswa14(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.printf("%s\t%s\t%s\t%.1f\n", nama, nim, kelas, ipk);
    }
}

