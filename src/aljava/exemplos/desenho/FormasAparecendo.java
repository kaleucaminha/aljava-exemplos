package aljava.exemplos.desenho;

import aljava.Alj;
import java.awt.Polygon;

public class FormasAparecendo {
  public static void main(String args[]){
    
    Alj.cor.transparencia(100);
    
    int transparencia = 100;
    while(transparencia > 0){
      transparencia -= 1;

      //Limpa telae e configura cor laranja
      Alj.tela.limpa();
      Alj.cor.rgb(255, 200, 100);

      //Desenha um texto informando o valor da transparência com uma linha abaixo.
      Alj.cor.transparencia(0);
      Alj.desenha.texto(10, 28, "Transparência: "+transparencia, 20);
      Alj.desenha.linha(10, 42, 290, 42);

      //Desenha as três formas geométricas mais básicas
      Alj.cor.transparencia(transparencia);
      Alj.desenha.retangulo(20, 170, 40, 40);
      Alj.desenha.oval(200, 60, 40, 40);
      Alj.desenha.triangulo(100, 120, 40, 40);

      //Coordenadas x e y do polígono, Ex: 100,100 -> 200, 100 -> 300, 200, etc...
      int xs[] = {100, 200, 300, 150, 100};
      int ys[] = {100, 100, 200, 150, 100};
      Alj.desenha.poligono(xs, ys);
      
      Alj.tela.exibe();      
      Alj.util.espera(50);
    }       
  }
}
