package aljava.exemplos.mouse;

import aljava.Alj;

public class Main {
  public static void main(String args[]){
    Rastreador r = new Rastreador();
    
    while(true){      
      r.rastreiaMouse();
      
      Alj.tela.exibe();   
    }       
  }
}
