package aljava.exemplos.cor;

import aljava.Alj;
import java.awt.Color;

public class FormasDeInformarCor {
  public static void main(String args[]){ 
                  
      Alj.tela.limpa();

      /**
       * Hexadecimal � a forma de escolher uma cor mais comum da Web.
       * Tabela de cores: http://efeitosespeciais.net/tabela.htm
       * Programa para encontrar esquemas de cores: http://colorschemedesigner.com/
       */
      Alj.cor.hexadecimal("#2266FF");
      Alj.desenha.oval(20, 20, 100, 100);

      /**
       * No in�cio com Aljava, usamos este m�todo para informar uma cor pelo nome.
       * As cores dispon�veis s�o: "vermelho", "laranja", "ciano", "preto", "azul", "amarelo", "verde", "magenta" e "branco"
       * Se uma cor desconhecida for informada, ser� usada o preto.
       */
      Alj.cor.nome("vermelho");
      Alj.desenha.oval(140, 20, 100, 100);

      /**
       * O Java tem sua pr�pria classe Color.
       * Voc� tamb�m pode informar uma cor usando um objeto dessa classe.
       * Refer�ncia Java: http://docs.oracle.com/javase/1.4.2/docs/api/java/awt/Color.html
       */
      Alj.cor.objeto(Color.magenta);
      Alj.desenha.oval(20, 140, 100, 100);

      /**
       * Cores s�op formadas pro tr�s faixas de luz, vermelha, verde e azul.
       * Este m�todo � o melhor quando � necess�rio criar animac�es com cores
       */
      Alj.cor.rgb(120, 255, 0);
      Alj.desenha.oval(140, 140, 100, 100);
      
      Alj.tela.exibe();      
  }
}
