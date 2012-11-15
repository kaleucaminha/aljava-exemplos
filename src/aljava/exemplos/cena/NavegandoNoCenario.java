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
public class NavegandoNoCenario {

     public static void main(String args[]){
         String arquivo = "recursos/aljava.exemplos.cena/cenario1.cena";
         Cena cena1 = new Cena(arquivo);
         cena1.configTile(1, "recursos/aljava.exemplos.cena/img/terra.png");
         cena1.configTile(2, "recursos/aljava.exemplos.cena/img/fundo.jpg", true);
         cena1.configTile(3, "recursos/aljava.exemplos.cena/img/fundo.jpg");
         cena1.tamanhoTiles(48, 48);

         Alj.inicializa(400,288);

         while(true){
             Alj.tela.limpa();
             cena1.desenha();

             if(Alj.tecla.press("direita")){
                 cena1.moveHorizontal(-10);
             }

             if(Alj.tecla.press("esquerda")){
                 cena1.moveHorizontal(10);
             }

             if(Alj.tecla.press("cima")){
                 cena1.moveVertical(10);
             }

             if(Alj.tecla.press("baixo")){
                 cena1.moveVertical(-10);
             }



             if(Alj.tecla.press("enter")){
                  cena1.configTile(2, "recursos/aljava.exemplos.cena/img/terra.png");
                  cena1.configTile(1, "recursos/aljava.exemplos.cena/img/fundo.jpg");
             }

             Alj.tela.exibe();
             Alj.util.espera(50);
         }
     }

}
