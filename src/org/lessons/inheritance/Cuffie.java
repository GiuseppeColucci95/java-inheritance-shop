package org.lessons.inheritance;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

  private String colore;
  private boolean isWireless;

  // constructors
  public Cuffie(String nome, String marca, BigDecimal prezzo, int iva, String colore, boolean isWireless) {
    super(nome, marca, prezzo, iva);
    this.colore = colore;
    this.isWireless = isWireless;
  }

  // getters and setters
  public String getColore() {
    return this.colore;
  }

  public void setColore(String colore) {
    this.colore = colore;
  }

  public boolean isWireless() {
    return isWireless;
  }

  public void setIsWireless(boolean isWireless) {
    this.isWireless = isWireless;
  }

  // other methods
  @Override
  public String toString() {
    return super.toString() + String.format(", colore: %s, wireless: %s", colore, isWireless);
  }

  @Override
  public BigDecimal getPrezzoScontato() {
    if (this.isWireless == false) {
      return this.prezzo.subtract(this.prezzo.multiply(new BigDecimal(7)).divide(new BigDecimal(100)));
    } else {
      return super.getPrezzoScontato();
    }
  }
}
