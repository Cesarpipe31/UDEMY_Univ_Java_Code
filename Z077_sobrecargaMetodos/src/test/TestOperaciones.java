package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(7, 5);
        System.out.println("resultado = " + resultado);
        var resultado1 = Operaciones.sumar(27.0, 6);
        System.out.println("resultado1 = " + resultado1);
    }
    
}
