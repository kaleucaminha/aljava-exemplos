package aljava.exemplos.som;

import aljava.Alj;
import aljava.midia.Som;

public class NotasMusicais {

    public static void main(String args[]){

        Alj.util.espera(500);
        
        Alj.desenha.texto(20, 20, "Aguarde carregamento dos sons...");
        Alj.tela.exibe();

        //Em algumas máquinas o primeiro som demora a carregar, de modo que basta carregar uma vez que fica ótimo.
        Som carregaSom = new Som("recursos/aljava.exemplos.som/do_piano.wav");

        boolean sLiberado = false;
        boolean dLiberado = false;

        while(true){
            Alj.tela.limpa();

            //Tecla Ré
            Alj.desenha.texto(20, 40, "Pressione s -> Ré");
            if(Alj.tecla.press("s") && sLiberado){
                sLiberado = false;
                Som som = new Som("recursos/aljava.exemplos.som/re_piano.wav");
                som.toca();
            }

            if(!Alj.tecla.press("s")) {
                sLiberado = true;
            }

            //Tecla Ré
            Alj.desenha.texto(20, 60, "Pressione d -> Fá");
            if(Alj.tecla.press("d") && dLiberado){
                dLiberado = false;
                Som som = new Som("recursos/aljava.exemplos.som/fa_piano.wav");
                som.toca();
            }

            if(!Alj.tecla.press("d")) {
                dLiberado = true;
            }

           
            Alj.tela.exibe();
        }
    }
}
