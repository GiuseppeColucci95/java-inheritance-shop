package org.lessons.inheritance;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    Prodotto qualcosa = new Prodotto("Qualcosa", "Qualche marca", new BigDecimal(399.00), 22);

    Smartphone iPhone = new Smartphone("Iphone 15 Pro Max", "Apple", new BigDecimal(1399.99), 22,
        "CKJSEUNLUNLKJNL4KJN23D2KJD", 256);
    Televisori hiSense = new Televisori("Televisore tecnologico", "HiSense", new BigDecimal(2400.00), 22, 50, 40, 5,
        true);
    Cuffie logitech = new Cuffie("Cuffie audio surround", "Logitech", new BigDecimal(79.99), 18, "nero", true);

    System.out.println(qualcosa);
    System.out.println(iPhone);
    System.out.println(hiSense);
    System.out.println(logitech);
  }
}
