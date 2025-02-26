package Praktikum3;

public class DataDosen14 {
        // Method untuk menampilkan semua data dosen
        public void dataSemuaDosen(Dosen14[] arrayOfDosen) {
            for (Dosen14 dosen : arrayOfDosen) {
                dosen.tampilkanInfo();  // Memanggil method tampilkanInfo() untuk setiap objek Dosen
            }
        }
    
        // Method untuk menampilkan jumlah dosen berdasarkan jenis kelamin
        public void jumlahDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
            int pria = 0, wanita = 0;
            for (Dosen14 dosen : arrayOfDosen) {
                if (dosen.jenisKelamin) {
                    pria++;
                } else {
                    wanita++;
                }
            }
            System.out.println("Jumlah Dosen Pria     : " + pria);
            System.out.println("Jumlah Dosen Wanita   : " + wanita);
        }
    
        // Method untuk menampilkan rata-rata usia dosen berdasarkan jenis kelamin
        public void rerataUsiaDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
            int priaUsia = 0, wanitaUsia = 0;
            int priaCount = 0, wanitaCount = 0;
    
            for (Dosen14 dosen : arrayOfDosen) {
                if (dosen.jenisKelamin) {
                    priaUsia += dosen.usia;
                    priaCount++;
                } else {
                    wanitaUsia += dosen.usia;
                    wanitaCount++;
                }
            }
    
            if (priaCount > 0) {
                System.out.println("Rata-rata usia Dosen Pria: " + (priaUsia / priaCount));
            }
            if (wanitaCount > 0) {
                System.out.println("Rata-rata usia Dosen Wanita: " + (wanitaUsia / wanitaCount));
            }
        }
    
        // Method untuk menampilkan data dosen paling tua
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
    
        // Method untuk menampilkan data dosen paling muda
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
    

