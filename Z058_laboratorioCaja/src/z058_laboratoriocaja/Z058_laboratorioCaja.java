package z058_laboratoriocaja;

import java.util.Scanner;
import z058_laboratoriocaja.controller.ServiceCaja;
import z058_laboratoriocaja.model.Caja;

public class Z058_laboratorioCaja {

    public static void main(String[] args) {
        ServiceCaja sc = new ServiceCaja();
        Caja c1 = sc.crearCaja();
        System.out.println("Datos caja 1: " + c1.toString());
        Caja c2 = new Caja(7, 5, 20);
        System.out.println("Datos caja 2: " + c2.toString());
        System.out.println("El volumen de C1 es: " + sc.calcularVolumnen(c1));
        System.out.println("El volumen de C2 es: " + sc.calcularVolumnen(c2));
    }
}
