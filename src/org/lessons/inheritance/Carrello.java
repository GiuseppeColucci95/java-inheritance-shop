package org.lessons.inheritance;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

  private static Smartphone[] smartphones = {
      new Smartphone("Iphone 15 pro max", "Apple", new BigDecimal(1499.99), 22, "NCVW7IH4I7C", 256),
      new Smartphone("Iphone 13", "Apple", new BigDecimal(1299.99), 22, "C87WYNCIACL", 512),
      new Smartphone("Samsung Galaxy s22", "Apple", new BigDecimal(1300), 22, "C87WYON78NW87", 256)
  };
  private static Televisori[] televisori = {
      new Televisori("HiSense 4k", "HiSense", new BigDecimal(3499.99), 22, 50, 40, 5, true),
      new Televisori("Samsung 4k", "Samsung", new BigDecimal(3799.99), 22, 60, 50, 3, true),
      new Televisori("LG 4k", "LG", new BigDecimal(1499.99), 22, 40, 35, 6, false)
  };
  private static Cuffie[] cuffie = {
      new Cuffie("Beats", "Apple", new BigDecimal(99.99), 22, "white", false),
      new Cuffie("Airpods Pro", "Apple", new BigDecimal(299.99), 22, "white", true),
      new Cuffie("Galaxy Buds Pro", "Samsung", new BigDecimal(199.99), 22, "black", true)
  };

  private Prodotto[] carrello;

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Scegli il prodotto da inserire nel carrello (es smartphones, televisori, cuffie...): ");
    String prodottoDaAggiungere = scan.nextLine().trim().toLowerCase();

    switch (prodottoDaAggiungere) {
      case "smartphones":
        for (int i = 0; i < smartphones.length; i++) {
          System.out.println(String.format("ID: %d, nome: %s, marca: %s, prezzo: %.2f", i + 1, smartphones[i].nome,
              smartphones[i].marca, smartphones[i].prezzo));
        }
        System.out.print("Scegli uno smartphone da aggiungere al carrello, selezionando il numero corrispondente: ");
        break;
      case "televisori":
        for (int i = 0; i < televisori.length; i++) {
          System.out.println(String.format("ID: %d, nome: %s, marca: %s, prezzo: %.2f", i + 1, televisori[i].nome,
              televisori[i].marca, televisori[i].prezzo));
        }
        System.out.print("Scegli un televisore da aggiungere al carrello, selezionando il numero corrispondente: ");
        break;
      case "cuffie":
        for (int i = 0; i < cuffie.length; i++) {
          System.out.println(String.format("ID: %d, nome: %s, marca: %s, prezzo: %.2f", i + 1, cuffie[i].nome,
              cuffie[i].marca, cuffie[i].prezzo));
        }
        System.out.print("Scegli un paio cuffie da aggiungere al carrello, selezionando il numero corrispondente: ");
        break;
      default:
        break;
    }

    int idProdottoScelto = scan.nextInt() - 1;

  }
}
