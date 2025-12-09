package entidades;

import java.lang.reflect.Constructor;

public class Camiseta {
 private String color;
 private String tamanho;
 private Double preco;
 public Camiseta(){}

  public Camiseta(String color, String tamanho, Double preco){
     this.color = color;
     this.tamanho = tamanho;
     this.preco = preco;
  }
  public String getColor() {
        return color;
    }
    public void setColor(String color) {
     this.color = color;
    }
    public String getTamanho() {
     return tamanho;
    }
    public void setTamanho(String tamanho) {
     this.tamanho = tamanho;
    }
    public Double getPreco() {
     return preco;
    }
    public void setPreco(Double preco) {
     this.preco = preco;
    }


    public double calcularDesconto(double valor){
        return this.preco;
    }
    public void exibirDetalhes() {
        System.out.println("Detales da camisa:");
        System.out.println("Cor:", +color);
        System.out.println("tamanho:", +tamanho);
        System.out.println("preço:", +preco);
    }









}





















}
