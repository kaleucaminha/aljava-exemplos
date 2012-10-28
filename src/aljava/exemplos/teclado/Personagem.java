package aljava.exemplos.teclado;

import aljava.Alj;

public class Personagem {

    JoystickTeclado j;
    String cor;
    int x;
    int y;

    public Personagem(JoystickTeclado _j, String _cor){
        j = _j;
        cor = _cor;
        x = Alj.util.sorteia(0, 300);
        y = Alj.util.sorteia(0, 300);
    }

    public void processa() {
        if(j.esquerdaPress()){
            x -= 1;
        }

        if(j.direitaPress()){
            x += 1;
        }

        if(j.acaoPress()){
            x = Alj.util.sorteia(0, 300);
            y = Alj.util.sorteia(0, 300);
            //Tempo para o jogador tirar o dedo do espaço
            Alj.util.espera(200);
        }
    }

    public void desenha(){
        Alj.cor.nome(cor);
        Alj.desenha.oval(x, y, 20, 20);
    }
}
