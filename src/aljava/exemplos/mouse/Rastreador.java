package aljava.exemplos.mouse;

import aljava.Alj;

public class Rastreador {

    public void rastreiaMouse() {
        int xMouse = Alj.mouse.x();
        int yMouse = Alj.mouse.y();

        Alj.desenha.oval(xMouse - 1, yMouse - 1, 2, 2);

        if (Alj.mouse.clickE()) {
            Alj.cor.rgb(255, 0, 0);
            Alj.desenha.oval(xMouse - 10, yMouse - 10, 20, 20);
        }

        if (Alj.mouse.clickM()) {
            Alj.cor.rgb(0, 255, 0);
            Alj.desenha.oval(xMouse - 10, yMouse - 10, 20, 20);
        }

        if (Alj.mouse.clickD()) {
            Alj.cor.rgb(0, 0, 255);
            Alj.desenha.oval(xMouse - 10, yMouse - 10, 20, 20);
        }
    }
}
