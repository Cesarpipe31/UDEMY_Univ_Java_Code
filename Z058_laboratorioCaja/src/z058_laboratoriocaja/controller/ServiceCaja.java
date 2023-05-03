package z058_laboratoriocaja.controller;

import java.util.Scanner;
import z058_laboratoriocaja.model.Caja;


public class ServiceCaja {    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Caja crearCaja(){
        System.out.println("Ingrese el ancho de la caja: ");
        int ancho = leer.nextInt();
        System.out.println("Ingrese el profundo de la caja: ");
        int profundo = leer.nextInt();
        System.out.println("Ingrese el alto de la caja: ");
        int alto = leer.nextInt(); 
        return new Caja(ancho, profundo, alto);
    }
    
    public int calcularVolumnen(Caja c1){
        return c1.getAncho() * c1.getProfundo() * c1.getAlto();
    }
}
