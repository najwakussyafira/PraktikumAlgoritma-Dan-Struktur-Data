public class DosenMain14 {
    public static void main(String[] args) {
        System.out.println("===== PROGRAM DATA DOSEN 1 =====");
        // Membuat objek Dosen dengan konstruktor default
        Dosen14 dosen1 = new Dosen14("199906200", "Mark lee", true, 2010, "Teknik Informatika");
        dosen1.idDosen = "199906200";
        dosen1.nama = "Mark lee";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Teknik Informatika";

        System.out.println();

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2015);
        dosen1.ubahKeahlian("Statistika");

        System.out.println();
        System.out.println("\nSetelah diupdate: ");
        dosen1.tampilInformasi();

        System.out.println();
        System.out.println("===== PROGRAM DATA DOSEN 2 =====");

        Dosen14 dosen2 = new Dosen14("11995748336", "Sehun", true, 2011, "Teknik ");
        dosen2.idDosen = "1995748336";
        dosen2.nama = "Sehun";
        dosen2.statusAktif = true;
        dosen2.tahunBergabung = 2011;
        dosen2.bidangKeahlian = "Teknik Sipil";

        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2011);
        dosen2.ubahKeahlian("Teknik Elektronika");

        System.out.println();
        System.out.println("Setelah diupdate: ");
        dosen2.tampilInformasi();
        System.out.println();

        System.out.println("===== TERIMAKASIH SUDAH MENGAKSES PROGRAM DATA DOSEN =====");
    }
}