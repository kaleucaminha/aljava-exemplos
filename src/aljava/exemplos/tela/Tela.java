package aljava.exemplos.tela;

import aljava.Alj;

public class Tela {
  public static void main(String args[]){           
    
    Alj.tela.exibeMensagem("Olá. Pressione Enter para mudar a largura e altura da janela.");
        
    int largura = 740;
    int altura = 180;
    String textoQualquer = "Aqui vai um texto que você informar";  
    
    Alj.inicializa(largura, altura);
    
    while(true){  
          
      Alj.tela.limpa();  
      
      if(Alj.tecla.press("enter")){
        largura = Alj.tela.solicitaNumero("Informe a largura:");
        altura = Alj.tela.solicitaNumero("Informe a altura:");
        textoQualquer = Alj.tela.solicitaTexto("Ïnforme um texto qualquer:");
        
        Alj.inicializa(largura, altura);
        
      }
      

      String tamanhoTela = largura+" x "+altura;
      Alj.desenha.texto(20, 60, tamanhoTela, 40);
      
      Alj.desenha.texto(20, 100, textoQualquer, 40);

      Alj.tela.exibe();
      Alj.util.espera(50);
    
    }       
  }
}
