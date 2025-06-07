package org.lessons.inheritance;

import java.math.BigDecimal;

public class Televisori extends Prodotto {

  private int lunghezza;
  private int larghezza;
  private int spessore;
  private boolean smart;

  // constructors
  public Televisori(String nome, String marca, BigDecimal prezzo, int iva, int lunghezza, int larghezza, int spessore,
      boolean smart) {
    super(nome, marca, prezzo, iva);
    this.lunghezza = lunghezza;
    this.larghezza = larghezza;
    this.spessore = spessore;
    this.smart = smart;
  }

  // getters and setters
  public int getLunghezza() {
    return this.lunghezza;
  }

  public void setLunghezza(int lunghezza) {
    this.lunghezza = lunghezza;
  }

  public int getLarghezza() {
    return this.larghezza;
  }

  public void setLarghezza(int larghezza) {
    this.larghezza = larghezza;
  }

  public int getSpessore() {
    return this.spessore;
  }

  public void setSpessore(int spessore) {
    this.spessore = spessore;
  }

  public boolean getSmart() {
    return this.smart;
  }

  public void setSmart(boolean smart) {
    this.smart = smart;
  }

  // other methods
  @Override
  public String toString() {
    return super.toString() + String.format(", lunghezza: %d, larghezza: %d, spessore: %d, smart: %s", lunghezza,
        larghezza, spessore, smart);
  }
}
