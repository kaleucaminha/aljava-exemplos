package aljava.exemplos.teclado;

import aljava.Alj;

public class Main {

    public static void main(String args[]) {
        Alj.tela.tamanho(320, 320);

        //Usa as teclas default
        JoystickTeclado j1 = new JoystickTeclado();
        Personagem p1 = new Personagem(j1, "azul");

        //Usa teclas definidas manualmente
        JoystickTeclado j2 = new JoystickTeclado();
        j2.configTeclaAcao("s");
        j2.configTeclaEsquerda("a");
        j2.configTeclaDireita("d");
        Personagem p2 = new Personagem(j2, "vermelho");

        while (true) {
            Alj.tela.limpa();
            
            p1.processa();
            p2.processa();

            p1.desenha();
            p2.desenha();

            Alj.tela.exibe();
            Alj.util.espera(20);
        }
    }
}
