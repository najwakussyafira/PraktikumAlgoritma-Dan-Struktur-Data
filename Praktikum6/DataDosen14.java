package Praktikum6;

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

    void insertionSort() {
        if (idx <= 1) {
            System.out.println("Data belum cukup untuk diurutkan!");
            return;
        }

        for (int i = 1; i < idx; i++) {
            Dosen14 temp = listDsn[i];
            int j = i;
            while (j > 0 && listDsn[j - 1].usia < temp.usia) {
                listDsn[j] = listDsn[j - 1];
                j--;
            }
            listDsn[j] = temp;
        }
    }

}

