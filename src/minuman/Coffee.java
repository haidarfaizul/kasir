package minuman;

import java.util.Scanner;

public class Coffee {

  private int totallatte, totalAmericano, totalCapucino, totalCoffeeCream;
  private int harga[] = { 15000, 10000, 15000, 20000 };

  Scanner input = new Scanner(System.in);

  // private int Latte = 15000;
  // private int Americano = 10000;
  // private int Cappucino = 15000;
  // private int coffeecream = 20000;

  // setter getter
  public void setbanyaklatte(int totallatte) {
    this.totallatte = totallatte;
  }

  public int gettottallattte() {
    return totallatte;
  }

  public void setbanyakAmericano(int totalAmericano) {
    this.totalAmericano = totalAmericano;
  }

  public int gettottalAmericano() {
    return totalAmericano;
  }

  public void setbanyakCappucino(int totalCapucino) {
    this.totalCapucino = totalCapucino;
  }

  public int gettottalCappucino() {
    return totalCapucino;
  }

  public void setbanyakCoffeeCream(int totalCoffeeCream) {
    this.totalCoffeeCream = totalCoffeeCream;
  }

  public int gettottalCoffeeCream() {
    return totalCoffeeCream;
  }

  // method
  public void Latte() {
    System.out.println("Harga Latte per cup Rp." + this.harga[0]);
    System.out.print("Ingin memesan berapa banyak: ");
    int totallatte = input.nextInt() * this.harga[0];
    setbanyaklatte(totallatte);
    System.out.println("Total: Rp." + totallatte);
  }

  public void Americano() {
    System.out.println("Harga Americano per cup Rp." + this.harga[1]);
    System.out.print("Ingin memesan berapa banyak: ");
    int totalAmericano = input.nextInt() * this.harga[1];
    setbanyakAmericano(totalAmericano);
    System.out.println("Total: Rp." + totalAmericano);
  }

  public void Cappucino() {
    System.out.println("Harga Cappucino per cup Rp." + this.harga[2]);
    System.out.print("Ingin memesan berapa banyak: ");
    int totalCapucino = input.nextInt() * this.harga[2];
    setbanyakCappucino(totalCapucino);
    System.out.println("Total: Rp." + totalCapucino);
  }

  public void CoffeeCream() {
    System.out.println("Harga Coffee Cream per cup Rp." + this.harga[3]);
    System.out.print("Ingin memesan berapa banyak: ");
    int totalCoffeeCream = input.nextInt() * this.harga[3];
    setbanyakCoffeeCream(totalCoffeeCream);
    System.out.println("Total: Rp." + totalCoffeeCream);
  }

  public void totalCoffee() {
    int totalCoffee = +gettottalAmericano() + gettottalCappucino() + gettottalCoffeeCream() + gettottallattte();
    System.out.println("\nTotal keseluruhan : Rp." + totalCoffee);
  }
}
