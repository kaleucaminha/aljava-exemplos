/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aljava.exemplos.animacao;

import aljava.Alj;
import aljava.midia.Animacao;

/**
 *
 * @author kaleu
 */
public class Main {
  public static void main(String args[]){
    
    Animacao animacao = new Animacao(200);
    animacao.addImagem("imagens/ryu/chute.png");
    animacao.addImagem("imagens/ryu/chute2.png");
    animacao.addImagem("imagens/ryu/chute.png");
    animacao.addImagem("imagens/ryu/soco_direita.png");
    animacao.addImagem("imagens/ryu/soco_esquerda.png");
    animacao.addImagem("imagens/ryu/haduken.png");
    animacao.iniciaEmLoop();
    
    while(true){ 
      Alj.tela.limpa();

      if( Alj.tecla.press("esquerda") ){
        animacao.alteraLargura(-20);
        Alj.util.espera(200);
      }

      if( Alj.tecla.press("direita") ){
        animacao.alteraLargura(20);
        Alj.util.espera(200);
      }

      if( Alj.tecla.press("cima") ){
        animacao.alteraAltura(20);
        Alj.util.espera(200);
      }
            
      if( Alj.tecla.press("baixo") ){
        animacao.alteraAltura(-20);
        Alj.util.espera(200);
      }


      if( Alj.tecla.press("espaco") ){
        animacao.inverte();
      }
      
      animacao.processa();
      animacao.desenha(50, 50);

      Alj.tela.exibe();
    }
    
    
  }
}
