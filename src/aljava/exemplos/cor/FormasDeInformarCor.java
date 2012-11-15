package aljava.exemplos.cor;

import aljava.Alj;
import java.awt.Color;

public class FormasDeInformarCor {
  public static void main(String args[]){ 
                  
      Alj.tela.limpa();

      /**
       * Hexadecimal é a forma de escolher uma cor mais comum da Web.
       * Tabela de cores: http://efeitosespeciais.net/tabela.htm
       * Programa para encontrar esquemas de cores: http://colorschemedesigner.com/
       */
      Alj.cor.hexadecimal("#2266FF");
      Alj.desenha.oval(20, 20, 100, 100);

      /**
       * No início com Aljava, usamos este método para informar uma cor pelo nome.
       * As cores disponíveis são: "vermelho", "laranja", "ciano", "preto", "azul", "amarelo", "verde", "magenta" e "branco"
       * Se uma cor desconhecida for informada, será usada o preto.
       */
      Alj.cor.nome("vermelho");
      Alj.desenha.oval(140, 20, 100, 100);

      /**
       * O Java tem sua própria classe Color.
       * Você também pode informar uma cor usando um objeto dessa classe.
       * Referência Java: http://docs.oracle.com/javase/1.4.2/docs/api/java/awt/Color.html
       */
      Alj.cor.objeto(Color.magenta);
      Alj.desenha.oval(20, 140, 100, 100);

      /**
       * Cores sãop formadas pro três faixas de luz, vermelha, verde e azul.
       * Este método é o melhor quando é necessário criar animacões com cores
       */
      Alj.cor.rgb(120, 255, 0);
      Alj.desenha.oval(140, 140, 100, 100);
      
      Alj.tela.exibe();      
  }
}
