package Praktikum7;

public class DataDosen14 {
    Dosen14[] listDsn;
    int idx = 0;

    public DataDosen14(int jumlah) {
        listDsn = new Dosen14[jumlah];
    }

    void tambah(Dosen14 m) {
        if (idx < listDsn.length) {
            listDsn[idx] = m;
            idx++;

        } else {
            System.out.println("Data Dosen sudah penuh");
        }
    }
    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen yang tersedia untuk ditampilkan");
            return;
        }

        for (int i = 0; i < idx; i++) {
            listDsn[i].tampil();
        }
    }

    void sortingASC() {
        if (idx <= 1) {
            System.out.println("Jumlah data tidak mencukupi untuk diurutkan");
            return;
        }

        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listDsn[j].usia < listDsn[j - 1].usia) {
                    Dosen14 tmp = listDsn[j];
                    listDsn[j] = listDsn[j - 1];
                    listDsn[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        if (idx <= 1) {
            System.out.println("Jumlah data tidak mencukupi untuk diurutkan");
            return; 
        }

        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (listDsn[j].usia > listDsn[idxMax].usia) {
                    idxMax = j;
                }
            }

            Dosen14 tmp = listDsn[idxMax];
            listDsn[idxMax] = listDsn[i];
            listDsn[i] = tmp;
        }
    }
      // Pencarian Data dengan Sequential Search (mencari berdasarkan nama)
      void PencarianDataSequential(String nama) {
        boolean ditemukan = false;
        int jumlahHasil = 0;

        System.out.println("\nhasil pencarian untuk nama: " + nama);
        for (int i = 0; i < idx; i++) {
            if (listDsn[i].nama.equalsIgnoreCase(nama)) {
                listDsn[i].tampil();
                ditemukan = true;
                jumlahHasil++;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (jumlahHasil > 1) {
          System.out.println("Peringatan! Ditemukan lebih dari satu dengan nama yang sama");
       }
    }
    
   void pencarianDataBinary(int usia) {
    sortingASC(); 
    int low = 0, high = idx - 1, mid;
    boolean ditemukan = false;
    int jumlahHasil = 0;

    System.out.println("\nHasil pencarian untuk usia: " + usia);
    while (low <= high) {
        mid = (low + high) / 2;

        if (listDsn[mid].usia == usia) {
            int left = mid, right = mid;

            while (left >= 0 && listDsn[left].usia == usia) {
                listDsn[left].tampil();
                ditemukan = true;
                jumlahHasil++;
                left--;
            }

            while (right < idx && listDsn[right].usia == usia) {
                if (right != mid) {
                    listDsn[right].tampil();
                    jumlahHasil++;
                }
                ditemukan = true;
                right++;
            }

            break;
        } else if (listDsn[mid].usia < usia) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    if (!ditemukan) {
        System.out.println("Dosen dengan usia '" + usia + "' tidak ditemukan.");
   } else if (jumlahHasil > 1) {
    System.out.println("Peringatan! Ditemukan lebih dari satu dengan usia yang sama");
}
}
}