/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aljava.exemplos.rotacao;

import aljava.Alj;

/**
 *
 * @author kaleu
 */
public class Triangulo {
  int largura, altura, angulo;

  public Triangulo(int largura, int altura) {
    this.largura = largura;
    this.altura = altura;
    this.angulo = 0;
  }

  public void gira(int graus){
      this.angulo = (this.angulo + graus) % 360;
  }
  
  public void desenha(int x, int y){
      int xCentral = x + (largura / 2);
      int yCentral = y + (altura / 2);

      Alj.cor.nome("vermelho");
      Alj.desenha.oval(xCentral-2, yCentral-2, 4, 4);

      Alj.cor.rgb(255, 200, 100);
      Alj.transforma.rotaciona(angulo, xCentral, yCentral);
      Alj.desenha.triangulo(x, y, largura, altura);
      Alj.transforma.limpaRotacao();
    
  }
}
