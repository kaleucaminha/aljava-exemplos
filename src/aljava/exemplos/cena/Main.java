/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aljava.exemplos.cena;

import aljava.Alj;
import aljava.jogo.Cena;

/**
 *
 * @author KALEU
 */
public class Main {

     public static void main(String args[]){
         String arquivo = "recursos/aljava.exemplos.cena/cenario1.cena";
         Cena cena1 = new Cena(arquivo);
         cena1.configTile(1, "recursos/aljava.exemplos.cena/img/terra.png");
         cena1.configTile(2, "recursos/aljava.exemplos.cena/img/fundo.jpg");
         cena1.configTile(3, "recursos/aljava.exemplos.cena/img/terra_pedras.png");

         cena1.tamanhoTiles(32, 32);

         Cena cenaMiniatura = new Cena(arquivo);
         cenaMiniatura.configTile(1, "recursos/aljava.exemplos.cena/img/terra.png");
         cenaMiniatura.configTile(2, "recursos/aljava.exemplos.cena/img/fundo.jpg");
         cenaMiniatura.configTile(3, "recursos/aljava.exemplos.cena/img/terra_pedras.png");

         cenaMiniatura.tamanhoTiles(4, 4);
       //  Alj.tela.tamanho(800,800);

         while(true){
             Alj.tela.limpa();
             cena1.desenha(0,0);
            // cenaMiniatura.desenha();

             if(Alj.tecla.press("direita")){
                 cena1.moveHorizontal(-10);
             }

             if(Alj.tecla.press("esquerda")){
                 cena1.moveHorizontal(10);
             }

             cenaMiniatura.desenha(150,330);

             Alj.tela.exibe();
             Alj.util.espera(50);
         }
     }

}
