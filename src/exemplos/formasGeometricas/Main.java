package exemplos.formasGeometricas;

import aljava.Alj;
import java.awt.Polygon;

public class Main {
  public static void main(String args[]){
    Quadrado  q = new Quadrado(20, 20, 40, 40);
    Circulo   c = new Circulo(200, 20, 40, 40);
    Triangulo t = new Triangulo(100, 80, 40, 40);

    
    Alj.cor.transparencia(100);
    
    int contador = 100;
    while(contador > 0){
      contador -= 1;   
      
      Alj.tela.limpa();
      
      Alj.cor.transparencia(contador);
      
      q.desenha();
      c.desenha();
      t.desenha();
      int xs[] = {100, 200, 300, 150, 100};
      int ys[] = {100, 100, 200, 150, 100};
      //Alj.desenha.poligono(xs, ys);

      Polygon pol = new Polygon();
      pol.addPoint(100, 100);
      pol.addPoint(400, 350);
      pol.addPoint(200, 150);
      pol.addPoint(100, 100);
      Alj.desenha.poligono(pol);
      
      Alj.tela.exibe();      
      Alj.util.espera(50);
    }       
  }
}
