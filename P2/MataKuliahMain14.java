public class MataKuliahMain14 {
    public static void main(String[] args) {
        // Membuat objek mk1 menggunakan konstruktor default
        MataKuliah14 mk1 = new MataKuliah14();
        mk1.kodeMK = "IF101";
        mk1.nama = "ALSD";
        mk1.sks = 2;
        mk1.jumlahJam = 3;
        mk1.tampilInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();

        // Membuat objek mk2 menggunakan konstruktor berparameter
        MataKuliah14 mk2 = new MataKuliah14("IF102", "Basis Data", 4, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(3);
        mk2.kurangiJam(2);
        mk2.tampilInformasi();

        MataKuliah14 mk3 = new MataKuliah14("ID690", "Sistem Operasi", 2, 2);
        mk3.tampilInformasi();
        mk3.ubahSKS(5);
        mk3.tambahJam(3);
        mk3.kurangiJam(2);
        mk3.tampilInformasi();
    }
}
