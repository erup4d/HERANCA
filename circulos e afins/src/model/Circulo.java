package model;

public class Circulo extends FormaGeometrica {

      private double raio;

    // Construtor que recebe o valor do raio
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método que calcula a área e imprime
    public void calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
    }
}