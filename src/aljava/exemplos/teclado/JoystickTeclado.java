package aljava.exemplos.teclado;

import aljava.Alj;

class JoystickTeclado {
    String teclaEsquerda;
    String teclaDireita;
    String teclaAcao;

    public JoystickTeclado(){
        teclaEsquerda = "esquerda";
        teclaDireita = "direita";
        teclaAcao = "espaco";
    }

    public void configTeclaAcao(String teclaAcao) {
        this.teclaAcao = teclaAcao;
    }

    public void configTeclaDireita(String teclaDireita) {
        this.teclaDireita = teclaDireita;
    }

    public void configTeclaEsquerda(String teclaEsquerda) {
        this.teclaEsquerda = teclaEsquerda;
    }



    public boolean esquerdaPress(){
        return Alj.tecla.press(teclaEsquerda);
    }

    public boolean direitaPress(){
        return Alj.tecla.press(teclaDireita);
    }

    public boolean acaoPress(){
        return Alj.tecla.press(teclaAcao);
    }
}
