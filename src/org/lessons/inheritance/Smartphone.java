package org.lessons.inheritance;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

  private String imei;
  private int memoria;

  // constructors
  public Smartphone(String nome, String marca, BigDecimal prezzo, int iva, String imei, int memoria) {
    super(nome, marca, prezzo, iva);
    this.imei = imei;
    this.memoria = memoria;
  }

  // getters and setters
  public String getImei() {
    return this.imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public int getMemoria() {
    return this.memoria;
  }

  public void setMemoria(int memoria) {
    this.memoria = memoria;
  }

  // other methods
  @Override
  public String toString() {
    return super.toString() + String.format(", IMEI: %s, memoria: %d", imei, memoria);
  }
}
