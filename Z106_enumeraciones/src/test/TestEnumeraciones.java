package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Día 1 de la semana: " + Dias.LUNES);        
        //indicarDiaSemana(Dias.LUNES);
        System.out.println("Continente no. " + Continentes.EUROPA);
        System.out.println("Número paisas de este continente: " 
                + Continentes.EUROPA.getPaises());
    }   
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES: 
                System.out.println("Primer día");
                break;
            case MARTES:
                System.out.println("Segundo día");
                break;
            default:
                System.out.println("No registrado");
        }
    }
}
