package aljava.exemplos.cenacomcolisao;

import aljava.Alj;
import aljava.jogo.Camera;
import aljava.jogo.Cena;
import aljava.jogo.CenaComColisao;
import aljava.jogo.Retangulo;
import aljava.jogo.RetanguloGravidade;

/**
 *
 * @author KALEU
 */
public class MainComGravidade {

     public static void main(String args[]){
         Alj.inicializa(400, 288);
         
         String arquivo = "recursos/aljava.exemplos.cena/cenario1.cena";

         RetanguloGravidade r = new RetanguloGravidade(40, 80, 32, 32);

         CenaComColisao cena1 = new CenaComColisao(arquivo);
         cena1.configTile(1, "recursos/aljava.exemplos.cena/img/terra.png");
         cena1.configTile(2, "recursos/aljava.exemplos.cena/img/fundo.jpg", true);
         cena1.configTile(3, "recursos/aljava.exemplos.cena/img/fundo.jpg");
         cena1.tamanhoTiles(32, 32);

         cena1.adicionaObjeto(r);

         Camera camera = new Camera(cena1, r);
         

         while(true){
             Alj.tela.limpa();
             cena1.desenha();


             if(Alj.tecla.press("s")){
                 r.pula(10);
             }

             if(Alj.tecla.press("espaco")){
                 r.pula(18);
             }

             if(Alj.tecla.press("direita")){
                 r.moveX(10);
             }

             if(Alj.tecla.press("esquerda")){
                 r.moveX(-10);
             }

             if(Alj.tecla.press("cima")){
                 r.alteraAltura( r.pegaAltura() + 1);
                 r.alteraLargura( r.pegaLargura() + 1);
             }

             if(Alj.tecla.press("baixo")){
                  r.alteraAltura( r.pegaAltura() - 1);
                 r.alteraLargura( r.pegaLargura() - 1);
             }

             if(r.pegaY() > Alj.tela.pegaAltura()){
                 Alj.tela.exibeMensagem("You are dead man.!");
                 Alj.tela.finaliza();
             }

             if(r.pegaX() > Alj.tela.pegaLargura()){
                 Alj.tela.exibeMensagem("You Win.! Very Good.!");
                 Alj.tela.finaliza();
             }
             
             r.processa();
             camera.processa();
             cena1.processa();
             
             cena1.desenhaDebug(r);
             r.desenha();

             Alj.tela.exibe();
             Alj.util.espera(50);
         }
     }

}
