package org.lessons.inheritance;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

  public static void main(String[] args) {

    Prodotto[] carrello = new Prodotto[0];
    BigDecimal totalPrice = new BigDecimal(0.00);

    Smartphone[] smartphones = {
        new Smartphone("Iphone 15 pro max", "Apple", new BigDecimal(1499.99), 22, "NCVW7IH4I7C", 256),
        new Smartphone("Iphone 13", "Apple", new BigDecimal(1299.99), 22, "C87WYNCIACL", 512),
        new Smartphone("Samsung Galaxy s22", "Apple", new BigDecimal(1300), 22, "C87WYON78NW87", 256)
    };
    Televisori[] televisori = {
        new Televisori("HiSense 4k", "HiSense", new BigDecimal(3499.99), 22, 50, 40, 5, true),
        new Televisori("Samsung 4k", "Samsung", new BigDecimal(3799.99), 22, 60, 50, 3, true),
        new Televisori("LG 4k", "LG", new BigDecimal(1499.99), 22, 40, 35, 6, false)
    };
    Cuffie[] cuffie = {
        new Cuffie("Beats", "Apple", new BigDecimal(99.99), 22, "white", false),
        new Cuffie("Airpods Pro", "Apple", new BigDecimal(299.99), 22, "white", true),
        new Cuffie("Galaxy Buds Pro", "Samsung", new BigDecimal(199.99), 22, "black", true)
    };

    String[] carteFedelta = { "F987", "F977", "F187", "F922", "F399" };

    boolean insertInCart = true;
    boolean hasFidelityCard = false;

    Scanner scanFidelity = new Scanner(System.in);
    System.out.print("Hai una fidelity Card? (yes, no): ");
    String answerFidelityCard = scanFidelity.nextLine();

    while (insertInCart) {
      System.out.print("Scegli il prodotto da inserire nel carrello (es smartphones, televisori, cuffie...): ");
      Scanner scan = new Scanner(System.in);
      String prodottoDaAggiungere = scan.nextLine().trim().toLowerCase();

      switch (prodottoDaAggiungere) {
        case "smartphones":
          if (answerFidelityCard.equals("yes")) {
            System.out
                .println("Scegli uno smartphone da aggiungere al carrello, selezionando il numero corrispondente: ");
            for (int i = 0; i < smartphones.length; i++) {
              System.out
                  .println(String.format("ID: %d, nome: %s, marca: %s, prezzo: %.2f", i + 1, smartphones[i].getNome(),
                      smartphones[i].getMarca(), smartphones[i].getPrezzoScontato()));
            }
          } else {
            System.out
                .println("Scegli uno smartphone da aggiungere al carrello, selezionando il numero corrispondente: ");
            for (int i = 0; i < smartphones.length; i++) {
              System.out
                  .println(String.format("ID: %d, nome: %s, marca: %s, prezzo: %.2f", i + 1, smartphones[i].getNome(),
                      smartphones[i].getMarca(), smartphones[i].getPrezzo()));
            }
          }
          break;
        case "televisori":
          if (answerFidelityCard.equals("yes")) {
            System.out
                .println("Scegli un televisore da aggiungere al carrello, selezionando il numero corrispondente: ");
            for (int i = 0; i < televisori.length; i++) {
              System.out
                  .println(String.format("ID: %d, nome: %s, marca: %s, prezzo: %.2f", i + 1, televisori[i].getNome(),
                      televisori[i].getMarca(), televisori[i].getPrezzoScontato()));
            }
          } else {
            System.out
                .println("Scegli un televisore da aggiungere al carrello, selezionando il numero corrispondente: ");
            for (int i = 0; i < televisori.length; i++) {
              System.out
                  .println(String.format("ID: %d, nome: %s, marca: %s, prezzo: %.2f", i + 1, televisori[i].getNome(),
                      televisori[i].getMarca(), televisori[i].getPrezzo()));
            }
          }
          break;
        case "cuffie":
          if (answerFidelityCard.equals("yes")) {
            System.out
                .println("Scegli un paio cuffie da aggiungere al carrello, selezionando il numero corrispondente: ");
            for (int i = 0; i < cuffie.length; i++) {
              System.out.println(String.format("ID: %d, nome: %s, marca: %s, prezzo: %.2f", i + 1, cuffie[i].getNome(),
                  cuffie[i].getMarca(), cuffie[i].getPrezzoScontato()));
            }
          } else {
            System.out
                .println("Scegli un paio cuffie da aggiungere al carrello, selezionando il numero corrispondente: ");
            for (int i = 0; i < cuffie.length; i++) {
              System.out.println(String.format("ID: %d, nome: %s, marca: %s, prezzo: %.2f", i + 1, cuffie[i].getNome(),
                  cuffie[i].getMarca(), cuffie[i].getPrezzo()));
            }
          }
          break;
        default:
          break;
      }

      int idProdottoScelto = scan.nextInt() - 1;
      Prodotto[] nuovoCarrello = new Prodotto[carrello.length + 1];

      switch (prodottoDaAggiungere) {
        case "smartphones":
          Smartphone smartphoneDaAggiungere;
          if (answerFidelityCard.equals("yes")) {
            smartphoneDaAggiungere = new Smartphone(smartphones[idProdottoScelto].getNome(),
                smartphones[idProdottoScelto].getMarca(), smartphones[idProdottoScelto].getPrezzoScontato(),
                smartphones[idProdottoScelto].getIva(), smartphones[idProdottoScelto].getImei(),
                smartphones[idProdottoScelto].getMemoria());
            totalPrice = totalPrice.add(smartphones[idProdottoScelto].getPrezzoScontato());
          } else {
            smartphoneDaAggiungere = new Smartphone(smartphones[idProdottoScelto].getNome(),
                smartphones[idProdottoScelto].getMarca(), smartphones[idProdottoScelto].getPrezzo(),
                smartphones[idProdottoScelto].getIva(), smartphones[idProdottoScelto].getImei(),
                smartphones[idProdottoScelto].getMemoria());
            totalPrice = totalPrice.add(smartphones[idProdottoScelto].getPrezzo());
          }
          for (int i = 0; i < carrello.length; i++) {
            nuovoCarrello[i] = carrello[i];
          }
          nuovoCarrello[nuovoCarrello.length - 1] = smartphoneDaAggiungere;
          carrello = nuovoCarrello;
          break;
        case "televisori":
          Televisori televisoreDaAggiungere;
          if (answerFidelityCard.equals("yes")) {
            televisoreDaAggiungere = new Televisori(televisori[idProdottoScelto].getNome(),
                televisori[idProdottoScelto].getMarca(), televisori[idProdottoScelto].getPrezzoScontato(),
                televisori[idProdottoScelto].getIva(), televisori[idProdottoScelto].getLunghezza(),
                televisori[idProdottoScelto].getLarghezza(), televisori[idProdottoScelto].getSpessore(),
                televisori[idProdottoScelto].getSmart());
            totalPrice = totalPrice.add(televisori[idProdottoScelto].getPrezzoScontato());
          } else {
            televisoreDaAggiungere = new Televisori(televisori[idProdottoScelto].getNome(),
                televisori[idProdottoScelto].getMarca(), televisori[idProdottoScelto].getPrezzo(),
                televisori[idProdottoScelto].getIva(), televisori[idProdottoScelto].getLunghezza(),
                televisori[idProdottoScelto].getLarghezza(), televisori[idProdottoScelto].getSpessore(),
                televisori[idProdottoScelto].getSmart());
            totalPrice = totalPrice.add(televisori[idProdottoScelto].getPrezzo());
          }
          for (int i = 0; i < carrello.length; i++) {
            nuovoCarrello[i] = carrello[i];
          }
          nuovoCarrello[nuovoCarrello.length - 1] = televisoreDaAggiungere;
          carrello = nuovoCarrello;
          break;
        case "cuffie":
          Cuffie cuffieDaAggiungere;

          if (answerFidelityCard.equals("yes")) {
            cuffieDaAggiungere = new Cuffie(cuffie[idProdottoScelto].getNome(),
                cuffie[idProdottoScelto].getMarca(), cuffie[idProdottoScelto].getPrezzoScontato(),
                cuffie[idProdottoScelto].getIva(), cuffie[idProdottoScelto].getColore(),
                cuffie[idProdottoScelto].isWireless());
            totalPrice = totalPrice.add(cuffie[idProdottoScelto].getPrezzoScontato());
          } else {
            cuffieDaAggiungere = new Cuffie(cuffie[idProdottoScelto].getNome(),
                cuffie[idProdottoScelto].getMarca(), cuffie[idProdottoScelto].getPrezzo(),
                cuffie[idProdottoScelto].getIva(), cuffie[idProdottoScelto].getColore(),
                cuffie[idProdottoScelto].isWireless());
            totalPrice = totalPrice.add(cuffie[idProdottoScelto].getPrezzo());
          }
          for (int i = 0; i < carrello.length; i++) {
            nuovoCarrello[i] = carrello[i];
          }
          nuovoCarrello[nuovoCarrello.length - 1] = cuffieDaAggiungere;
          carrello = nuovoCarrello;
          break;
        default:
          break;
      }

      System.out.println("Vuoi inserire un nuovo prodotto nel carrello? (yes, no): ");
      Scanner scan2 = new Scanner(System.in);
      String answer = scan2.nextLine().trim().toLowerCase();
      if (answer.equals("yes")) {
        insertInCart = true;
      } else if (answer.equals("no")) {
        insertInCart = false;
        scan.close();
        scan2.close();
      } else {
        insertInCart = false;
        scan2.close();
        scan.close();
      }
    }

    System.out.println("Ecco il tuo carrello: ");
    for (int i = 0; i < carrello.length; i++) {
      System.out.println(carrello[i]);
    }

    System.out.println(String.format("Il totale dell'ordine è: %.2f euro", totalPrice));
  }
}
