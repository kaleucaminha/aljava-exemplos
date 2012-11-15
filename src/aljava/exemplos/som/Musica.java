package aljava.exemplos.som;

import aljava.Alj;
import aljava.midia.Som;

public class Musica {

    public static void main(String args[]){

        Alj.util.espera(500);
        
        Alj.desenha.texto(20, 20, "Aguarde carregamento da música...");
        Alj.tela.exibe();

        //Em algumas máquinas o primeiro som demora a carregar, de modo que basta carregar uma vez que fica ótimo.
        Som musica = new Som("recursos/aljava.exemplos.som/mario.wav");

        while(true){
            Alj.tela.limpa();

            //Tecla Ré
            Alj.desenha.texto(20, 20, "Pressione t -> Toca a Musica");
            if(Alj.tecla.press("t")){
               musica.toca();
            }

            Alj.desenha.texto(20, 40, "Pressione p -> Pausa a Musica");
            if(Alj.tecla.press("p")) {
                musica.pausa();
            }

            Alj.desenha.texto(20, 60, "Pressione r -> Reinicia a Musica");
            if(Alj.tecla.press("r")) {
                musica.reinicia();
            }

           
            Alj.tela.exibe();
        }
    }
}
