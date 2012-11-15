package aljava.exemplos.desenho;

import aljava.Alj;

public class Relogio {
  
  public static void main(String args[]){
    LinhaGirando segundos = new LinhaGirando(100, 100, 200, 200);
    LinhaGirando minutos = new LinhaGirando(115, 115, 185, 185);
    LinhaGirando horas = new LinhaGirando(130, 130, 170, 170);
    
    int contador = 0;
    while(true){
      contador += 1;   
      
      Alj.tela.limpa();

      segundos.gira(1);

      if(contador % 360 == 0){
        minutos.gira(6);
      }

      if(contador % 3600 == 0){
        horas.gira(30);
      }
      
      
      segundos.desenha();
      minutos.desenha();
      horas.desenha();
                  
      Alj.tela.exibe();      
      Alj.util.espera(5);
    }       
  }
}
