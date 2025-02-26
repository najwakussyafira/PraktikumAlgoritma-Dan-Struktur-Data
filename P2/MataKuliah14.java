public class MataKuliah14 {
        String kodeMK;
        String nama;
        int sks;
        int jumlahJam;
    
        // Konstruktor default
        public MataKuliah14() {
        }
    
        // Konstruktor berparameter
        public MataKuliah14(String kodeMK, String nama, int sks, int jumlahJam) {
            this.kodeMK = kodeMK;
            this.nama = nama;
            this.sks = sks;
            this.jumlahJam = jumlahJam;
        }
    
        // Method untuk menampilkan informasi
        void tampilInformasi() {
            System.out.println();
            System.out.println("Informasi Mata Kuliah");
            System.out.println("Nama Mata Kuliah: " + nama);
            System.out.println("Kode Mata Kuliah: " + kodeMK);
            System.out.println("SKS: " + sks);
            System.out.println("Jumlah Jam: " + jumlahJam);
        }
    
        // Method untuk mengubah SKS
        void ubahSKS(int sksBaru) {
            this.sks = sksBaru;
            System.out.println();
            System.out.println("SKS telah diubah menjadi: " + sksBaru);
        }
    
        // Method untuk menambah jam
        void tambahJam(int jam) {
            this.jumlahJam += jam;
            System.out.println();
            System.out.println("Jumlah Jam telah ditambah. Jam sekarang: " + jumlahJam);
        }
    
        // Method untuk mengurangi jam
        void kurangiJam(int jam) {
            if (this.jumlahJam <= jam) {
                System.out.println();
                System.out.println("Jumlah Jam telah dikurangi. Jam sekarang: " + jumlahJam);
            } else {
                jumlahJam -= jam;
                System.out.println();
                System.out.println("Jumlah jam tidak mencukupi untuk dikurangi.");
            }
        }
    }
    
