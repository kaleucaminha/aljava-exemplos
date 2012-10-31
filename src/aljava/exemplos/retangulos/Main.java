
package aljava.exemplos.retangulos;

import aljava.Alj;
import aljava.jogo.Retangulo;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Alj.util.espera(500);
        
        ArrayList<Retangulo> retangulos;
        retangulos = new ArrayList<Retangulo>();
        
        retangulos.add( new Retangulo(50, 50, 50, 50));
        retangulos.add( new Retangulo(200, 200, 75, 30));
        
        for(Retangulo r : retangulos){
            r.desenha();
        }
        
        Alj.tela.exibe();
    }

}
