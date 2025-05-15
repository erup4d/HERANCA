package desafio.pkg2;

import java.util.*;
import model.Circulo;

public class Desafio {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    try {
        // Solicitar o valor do raio para o círculo
        System.out.println("Digite o valor do raio do círculo:");
        double raio = scan.nextDouble();

        // Verificar se o valor do raio é válido
        if (raio <= 0) {
            throw new IllegalArgumentException("O valor do raio deve ser maior que zero.");
        }

        // Criar o objeto Circulo e calcular a área
        Circulo c = new Circulo(raio);
        c.calcularArea();

    } finally {
        scan.close(); // Agora corretamente colocado
    }
    }
}
