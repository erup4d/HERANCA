
package heranca;

import heranca.model.*;

public class Main {


    public static void main(String[] args) {
     
        Carro carro = new Carro("Honda", "Civic",20,true);
        carro.exibirDetalhes();
        System.out.println("\n =========================");
        Moto moto = new Moto("Suzuki", "GSX-R1000R", 1000);
        moto.exibirDetalhes();
        
    }
    
}
