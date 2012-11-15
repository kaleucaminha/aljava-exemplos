package aljava.exemplos.cenacomcolisao;

import aljava.Alj;
import aljava.jogo.Camera;
import aljava.jogo.CenaComColisao;
import aljava.jogo.Retangulo;

/**
 *
 * @author KALEU
 */
public class Main {

     public static void main(String args[]){
         Alj.inicializa(400, 288);
         
         String arquivo = "recursos/aljava.exemplos.cena/cenario1.cena";

         Retangulo r = new Retangulo(40, 80, 32, 32);

         CenaComColisao cena1 = new CenaComColisao(arquivo);
         cena1.configTile(1, "recursos/aljava.exemplos.cena/img/terra.png");
         cena1.configTile(2, "recursos/aljava.exemplos.cena/img/fundo.jpg", true);
         //Paredes invisíveis
         cena1.configTile(3, "recursos/aljava.exemplos.cena/img/fundo.jpg");
         cena1.tamanhoTiles(32, 32);









         cena1.adicionaObjeto(r);

         Camera camera = new Camera(cena1, r);
         

         while(true){
             Alj.tela.limpa();
             cena1.desenha(); 

             if(Alj.tecla.press("direita")){
                 r.moveX(1);
             }

             if(Alj.tecla.press("esquerda")){
                 r.moveX(-1);
             }

             if(Alj.tecla.press("cima")){
                 r.moveY(-1);
             }

             if(Alj.tecla.press("baixo")){
                 r.moveY(1);
                 
             }

              if(Alj.tecla.press("l")){
                 r.alteraAltura( r.pegaAltura() + 1);
                 r.alteraLargura( r.pegaLargura() + 1);
             }

             if(Alj.tecla.press("k")){
                 r.alteraAltura( r.pegaAltura() - 1);
                 r.alteraLargura( r.pegaLargura() - 1);
             }

             //Revelando o caminho secreto
             if(Alj.tecla.press("enter")){
                cena1.configTile(3, "recursos/aljava.exemplos.cena/img/terra.png");
             }


             camera.processa();
             cena1.processa();
             
             cena1.desenhaDebug(r);
             r.desenha();

             Alj.tela.exibe();
             Alj.util.espera(5);
         }
     }

}
