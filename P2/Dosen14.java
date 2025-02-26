public class Dosen14 {
     // Atribut
     String idDosen;
     String nama;
     int tahunBergabung;
     int masaKerja;
     String bidangKeahlian;
     String bidangKeahlianBaru;
     boolean statusAktif;

 // Konstruktor Default
 public Dosen14() {
}

// Konstruktor Berparameter
public Dosen14(String id, String nm, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
    nm = nama;
    id = idDosen;
    this.statusAktif = statusAktif;
    this.tahunBergabung = tahunBergabung;
    this.bidangKeahlian = bidangKeahlian;
}

// Method tampilInformasi
public void tampilInformasi() {
    System.out.println("ID Dosen: " + this.idDosen);
    System.out.println("Nama: " + this.nama);
    System.out.println("Status Aktif: " + (this.statusAktif ? "Aktif" : "Tidak Aktif"));
    System.out.println("Tahun Bergabung: " + this.tahunBergabung);
    System.out.println("Bidang Keahlian: " + this.bidangKeahlian);
}

// Method setStatusAktif
public void setStatusAktif(boolean statusAktif) {
    if (2025 - tahunBergabung == 35) {
        statusAktif = false;
        System.out.println("Dosen " + nama + " tidak aktif ");
    } else {
        statusAktif = true; 
        System.out.println("Dosen " + nama + " aktif ");
    }
}
// Method hitungMasaKerja
public int hitungMasaKerja(int thnSkrg) {
    return masaKerja = thnSkrg - this.tahunBergabung;
}

// Method ubahKeahlian
public void ubahKeahlian(String bidang) {
    this.bidangKeahlian = bidang;
}
}