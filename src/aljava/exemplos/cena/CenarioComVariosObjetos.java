/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aljava.exemplos.cena;

import aljava.Alj;
import aljava.jogo.Cena;
import aljava.jogo.Retangulo;

/**
 *
 * @author KALEU
 */
public class CenarioComVariosObjetos {

     public static void main(String args[]){
         String arquivo = "recursos/aljava.exemplos.cena/cenario1.cena";

         Cena cena1 = new Cena(arquivo);
         cena1.configTile(1, "recursos/aljava.exemplos.cena/img/terra.png");
         cena1.configTile(2, "recursos/aljava.exemplos.cena/img/fundo.jpg", true);
         cena1.configTile(3, "recursos/aljava.exemplos.cena/img/fundo.jpg");
         cena1.tamanhoTiles(48, 48);

         Retangulo r1 = new Retangulo(40, 40, 32, 32);
         Retangulo r2 = new Retangulo(840, 140, 32, 32);
         Retangulo r3 = new Retangulo(1440, 80, 32, 32);

         cena1.moveComCenario(r1);
         cena1.moveComCenario(r2);
         cena1.moveComCenario(r3);
         
         Alj.inicializa(400,288);

         while(true){
             Alj.tela.limpa();
             

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
             
             cena1.desenha();
             r1.desenha();
             r2.desenha();
             r3.desenha();

             if(Alj.tecla.press("enter")){
                  cena1.configTile(2, "recursos/aljava.exemplos.cena/img/terra.png");
                  cena1.configTile(1, "recursos/aljava.exemplos.cena/img/fundo.jpg");
             }

             Alj.tela.exibe();
             Alj.util.espera(50);
         }
     }

}
