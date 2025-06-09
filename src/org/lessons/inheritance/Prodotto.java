package org.lessons.inheritance;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {

  protected int codice;
  protected String nome;
  protected String marca;
  protected BigDecimal prezzo;
  protected int iva;

  // constructors
  public Prodotto(String nome, String marca, BigDecimal prezzo, int iva) {
    Random rand = new Random();
    this.codice = rand.nextInt(1000);
    this.nome = nome;
    this.marca = marca;
    this.prezzo = prezzo;
    this.iva = iva;
  }

  // getters and setters
  public int getCodice() {
    return this.codice;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public BigDecimal getPrezzo() {
    return this.prezzo;
  }

  public BigDecimal getPrezzoScontato() {
    return this.prezzo.subtract(this.prezzo.multiply(new BigDecimal(2)).divide(new BigDecimal(100)));
  }

  public void setPrezzo(BigDecimal prezzo) {
    this.prezzo = prezzo;
  }

  public int getIva() {
    return this.iva;
  }

  public void setIva(int iva) {
    this.iva = iva;
  }

  // other methods
  @Override
  public String toString() {
    return String.format("Prodotto con codice: %d, nome: %s, marca: %s, prezzo: %.2f, iva: %d", codice, nome, marca,
        prezzo, iva);
  }
}
