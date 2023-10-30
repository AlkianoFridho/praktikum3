import java.util.Scanner;

public class livetemplate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = input.nextDouble();

        System.out.print("Masukkan operasi (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = input.nextDouble();

        double hasil = 0.0;

        switch (operator) {
            case '+':
                hasil = bilangan1 + bilangan2;
                break;
            case '-':
                hasil = bilangan1 - bilangan2;
                break;
            case '*':
                hasil = bilangan1 * bilangan2;
                break;
            case '/':
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    System.out.println("Pembagian oleh nol tidak valid.");
                    return;
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
                return;
        }

        System.out.println("Hasil: " + hasil);

        input.close();
    }
}
