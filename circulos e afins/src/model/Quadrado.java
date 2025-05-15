package model;

public class Quadrado extends FormaGeometrica {

    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    void calcularArea() {
        double area = Math.pow(lado, 2);  // Alternativa: lado * lado
        System.out.println("A área do quadrado é: " + String.format("%.2f", area));
    }
}
