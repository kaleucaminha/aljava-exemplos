
package aljava.exemplos.retangulos;

import aljava.Alj;
import aljava.jogo.Retangulo;
import aljava.jogo.RetanguloGravidade;
import java.util.ArrayList;

public class MainComGravidade {

    public static void main(String[] args){
        Alj.util.espera(500);

        int forcaPulo = 15;
        
        ArrayList<RetanguloGravidade> retangulos;
        retangulos = new ArrayList<RetanguloGravidade>();
        RetanguloGravidade.CHAO = 300;
        retangulos.add( new RetanguloGravidade(50, 50, 50, 50));
        retangulos.add( new RetanguloGravidade(200, 200, 75, 30));

        while(true){
            Alj.tela.limpa();

            if(Alj.tecla.press("cima")){
                RetanguloGravidade.GRAVIDADE -= 0.1;
            }

            if(Alj.tecla.press("baixo")){
                RetanguloGravidade.GRAVIDADE += 0.1;
            }

            if(Alj.tecla.press("esquerda")){
                forcaPulo -= 1;
            }

            if(Alj.tecla.press("direita")){
                forcaPulo += 1;
            }

            for(RetanguloGravidade r : retangulos){
                if(Alj.tecla.press("espaco")){
                    r.pula(forcaPulo);
                }
                
                r.processa();
                r.desenha();
            }

            Alj.desenha.texto(20, 320, "Gravidade: "+RetanguloGravidade.GRAVIDADE, 16);
            Alj.desenha.texto(20, 340, "Força Pulo: "+forcaPulo, 16);
            Alj.tela.exibe();
            Alj.util.espera(20);
        }
        
        
    }

}
