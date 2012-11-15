package aljava.exemplos.rotacao;

import aljava.Alj;
import java.awt.Polygon;

public class TrianguloGirando {
  public static void main(String args[]){
    
    Triangulo t = new Triangulo(50, 50);
    
    int contador = 360;
    while(contador > 0){
      contador -= 1;   
      
      Alj.tela.limpa();
      
      t.gira(2);
      t.desenha(130, 130);

      Alj.tela.exibe();      
      Alj.util.espera(20);
    }       
  }
}
