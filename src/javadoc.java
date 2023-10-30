import java.util.Scanner;

/**
 * Kelas Mahasiswa merepresentasikan entitas mahasiswa dengan atribut nilai dan metode untuk mengelola nilai-nilai mahasiswa.
 */
public class javadoc {
    private String nama;
    private int jumlahMataKuliah;
    private double[] nilaiMataKuliah;

    /**
     * Konstruktor untuk membuat objek Mahasiswa.
     * @param nama Nama mahasiswa.
     * @param jumlahMataKuliah Jumlah mata kuliah yang diambil mahasiswa.
     */
    public javadoc(String nama, int jumlahMataKuliah) {
        this.nama = nama;
        this.jumlahMataKuliah = jumlahMataKuliah;
        nilaiMataKuliah = new double[jumlahMataKuliah];
    }

    /**
     * Metode untuk mengisi nilai mata kuliah.
     * @param mataKuliahIndex Indeks mata kuliah yang akan diisi nilai.
     * @param nilai Nilai mata kuliah.
     */
    public void isiNilaiMataKuliah(int mataKuliahIndex, double nilai) {
        nilaiMataKuliah[mataKuliahIndex] = nilai;
    }

    /**
     * Metode untuk menghitung rata-rata nilai mahasiswa.
     * @return Rata-rata nilai mahasiswa.
     */
    public double hitungRataRata() {
        double totalNilai = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalNilai += nilaiMataKuliah[i];
        }
        return totalNilai / jumlahMataKuliah;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input nama mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = input.nextLine();

        // Meminta input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = input.nextInt();

        // Membuat objek Mahasiswa
        javadoc mahasiswa = new javadoc(namaMahasiswa, jumlahMataKuliah);

        // Meminta dan mengisi nilai-nilai mata kuliah
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nilai mata kuliah ke-" + (i + 1) + ": ");
            double nilai = input.nextDouble();
            mahasiswa.isiNilaiMataKuliah(i, nilai);
        }

        // Menghitung dan menampilkan rata-rata nilai
        double rataRata = mahasiswa.hitungRataRata();
        System.out.println("Rata-rata nilai mahasiswa " + mahasiswa.nama + " adalah " + rataRata);

        // Menutup Scanner
        input.close();
    }
}
