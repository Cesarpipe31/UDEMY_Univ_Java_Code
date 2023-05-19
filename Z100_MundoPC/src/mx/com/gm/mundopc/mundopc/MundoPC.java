package mx.com.gm.mundopc.mundopc;

import mx.com.gm.mundopc.*;


public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Blueooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("Blueooth", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Orden orden1 = new Orden();
        
        orden1.agregarcomputadora(computadoraGamer);
        orden1.agregarcomputadora(computadoraHP);
        
        
        orden1.mostrarOrden();
        
    }
    
}
