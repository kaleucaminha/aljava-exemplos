package aljava.exemplos.texto;

import aljava.Alj;

public class Digitador {
  public static void main(String args[]){


    String s = Alj.tela.solicitaTexto("Informe um texto para ser digitado:");
    
    int contador = 0;
    while(contador < s.length()){  
      contador++;
      Alj.tela.limpa();
      
      String letters = s.substring(0, contador);
      
      Alj.cor.nome("vermelho");
      Alj.desenha.texto(40, 60, letters, 40);
      
      Alj.tela.exibe();      
      Alj.util.espera(100);
    
    }       
  }
}
