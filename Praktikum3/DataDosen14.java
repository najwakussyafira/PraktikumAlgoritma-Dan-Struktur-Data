package Praktikum3;

public class DataDosen14 {
        public void dataSemuaDosen(Dosen14[] arrayOfDosen) {
            System.out.println(" =========================== ");
            System.out.println("        DATA DOSEN           ");
            System.out.println(" =========================== ");
            for (Dosen14 dosen : arrayOfDosen) {
                dosen.tampilkanInfo();  
            }
        }
        public void jumlahDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
            System.out.println(" =========================== ");
            System.out.println("         DATA DOSEN          ");
            System.out.println(" (Bedasarkan Jenis Kelamin)  ");
            System.out.println(" =========================== ");

            int hitungpria = 0;
            int hitungwanita = 0;

            for (Dosen14 dosen14 : arrayOfDosen) {
                if (dosen14.jenisKelamin) {
                    hitungpria++;
                } else {
                    hitungwanita++;
                }
            }
            System.out.println("Jumlah Dosen Pria     : " + hitungpria);
            System.out.println("Jumlah Dosen Wanita   : " + hitungwanita);
        }
    
        // Method untuk menampilkan rata-rata usia dosen berdasarkan jenis kelamin
        public void rerataUsiaDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
            System.out.println("=======================================================");
            System.out.println("Rata-rata usia dosen (per jenis kelamin Wanita/pria) : ");
            int priaUsia = 0, wanitaUsia = 0;
            int hitungpria = 0, hitungwanita = 0;
    
            for (Dosen14 dosen : arrayOfDosen) {
                if (dosen.jenisKelamin) {
                    priaUsia += dosen.usia;
                    hitungpria++;
                } else {
                    wanitaUsia += dosen.usia;
                    hitungwanita++;
                }
            }
    
            if (hitungpria > 0) {
                System.out.println("Rata-rata usia Dosen Pria: " + (priaUsia / hitungpria));
            }
            if (hitungwanita > 0) {
                System.out.println("Rata-rata usia Dosen Wanita: " + (wanitaUsia / hitungwanita));
            }
        }
        public void infoDosenPalingTua(Dosen14[] arrayOfDosen) {
            Dosen14 dosenTua = arrayOfDosen[0];
    
            for (Dosen14 dosen : arrayOfDosen) {
                if (dosen.usia > dosenTua.usia) {
                    dosenTua = dosen;
                }
            }
            System.out.println("Dosen Paling Tua:");
            dosenTua.tampilkanInfo();
        }
        public void infoDosenPalingMuda(Dosen14[] arrayOfDosen) {
            Dosen14 dosenMuda = arrayOfDosen[0];
    
            for (Dosen14 dosen : arrayOfDosen) {
                if (dosen.usia < dosenMuda.usia) {
                    dosenMuda = dosen;
                }
            }
            System.out.println("Dosen Paling Muda:");
            dosenMuda.tampilkanInfo();
        }
    }
    

