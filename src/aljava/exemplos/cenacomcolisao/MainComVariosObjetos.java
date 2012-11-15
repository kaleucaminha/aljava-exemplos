package aljava.exemplos.cenacomcolisao;

import aljava.Alj;
import aljava.jogo.Camera;
import aljava.jogo.CenaComColisao;
import aljava.jogo.Retangulo;
import aljava.jogo.RetanguloGravidade;

/**
 *
 * @author KALEU
 */
public class MainComVariosObjetos {

     public static void main(String args[]){
         Alj.inicializa(400, 288);
         
         String arquivo = "recursos/aljava.exemplos.cena/cenario1.cena";

         RetanguloGravidade r = new RetanguloGravidade(20, 160, 32, 32);

         CenaComColisao cena1 = new CenaComColisao(arquivo);
         cena1.configTile(1, "recursos/aljava.exemplos.cena/img/terra.png");
         cena1.configTile(2, "recursos/aljava.exemplos.cena/img/fundo.jpg", true);
         cena1.configTile(3, "recursos/aljava.exemplos.cena/img/fundo.jpg");
         cena1.tamanhoTiles(32, 32);

         cena1.adicionaObjeto(r);

         Retangulo r1 = new Retangulo(40, 40, 32, 32);
         RetanguloGravidade r2 = new RetanguloGravidade(32*11, 140, 12, 12);
         Retangulo r3 = new Retangulo(32*24, 80, 32, 32);

         cena1.moveComCenario(r1);
         cena1.adicionaObjeto(r1);

         cena1.moveComCenario(r2);
         cena1.adicionaObjeto(r2);
         
         cena1.moveComCenario(r3);
         cena1.adicionaObjeto(r3);

         Camera camera = new Camera(cena1, r);
         

         while(true){
             Alj.tela.limpa();
             cena1.desenha(); 

             if(Alj.tecla.press("direita")){
                 r.moveX(5);
             }

             if(Alj.tecla.press("esquerda")){
                 r.moveX(-5);
             }

             if(Alj.tecla.press("cima")){
                 r.pula(15);
             }


              if(Alj.tecla.press("l")){
                 r.alteraAltura( r.pegaAltura() + 1);
                 r.alteraLargura( r.pegaLargura() + 1);
             }

             if(Alj.tecla.press("k")){
                 r.alteraAltura( r.pegaAltura() - 1);
                 r.alteraLargura( r.pegaLargura() - 1);
             }


             if(r.toca(r1) || r.toca(r2) || r.toca(r3)){
                 Alj.tela.exibeMensagem("Morreu Brow.! Hasta la vista");
                 Alj.tela.finaliza();
             }

             r.processa();
             
             r2.processa();
             r2.pula(10);

             
             if(r1.pegaX() <= 120){
                 r1.moveX(1);
             } else {
                 r1.moveY(1);
             }
             camera.processa();
             cena1.processa();
             
             cena1.desenha();
             cena1.desenhaDebug(r);
             r.desenha();
             r1.desenha();
             r2.desenha();
             r3.desenha();

             Alj.tela.exibe();
             Alj.util.espera(10);
         }
     }

}
