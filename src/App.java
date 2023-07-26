import java.util.Scanner;
import minuman.*;

public class App {

    public static void main(String[] args) throws Exception {
        Coffee objek1 = new Coffee();

        Scanner Inputan = new Scanner(System.in);

        boolean ulang = true;

        System.out.println("\nSelamat datang di Kopilihan");
        while (ulang) {
            System.out.println("\nSilahkan pilih menu");

            System.out.println("1. Latte");
            System.out.println("2. Americano");
            System.out.println("3. Cappucino");
            System.out.println("4. Coffee Cream");

            System.out.print("pilih menu : ");
            // Scanner masuk = new Scanner(System.in);
            int menu = Inputan.nextInt();
            switch (menu) {
                case 1:
                    objek1.Latte();
                    break;
                case 2:
                    objek1.Americano();
                    break;
                case 3:
                    objek1.Cappucino();
                    break;
                case 4:
                    objek1.CoffeeCream();
                    break;
                default:
                    System.out.println("pilihan anda tidak ada di daftar");
                    break;
            }
            System.out.print("\ningin memesan menu lain?(1/0) : ");
            int Ulang = Inputan.nextInt();
            if (Ulang == 1) {
                ulang = true;
            } else if (Ulang == 0) {
                ulang = false;
            } else {
                System.out.println("Inputan tidak tersedia");
            }
        }
        objek1.totalCoffee();
    }
}
