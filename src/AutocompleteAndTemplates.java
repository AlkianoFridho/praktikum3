import java.util.Scanner;

public class AutocompleteAndTemplates {
    // Atribut
    private String nama;
    private int umur;

    // Constructor
    public AutocompleteAndTemplates(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Method untuk mengucapkan selamat ulang tahun
    public void ucapUlangTahun() {
        System.out.println("Selamat ulang tahun, " + nama + "!");
        System.out.println("Sekarang Anda berusia " + umur + " tahun.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        AutocompleteAndTemplates ucapan = new AutocompleteAndTemplates(nama, umur);
        ucapan.ucapUlangTahun();

        input.close();
    }
}
