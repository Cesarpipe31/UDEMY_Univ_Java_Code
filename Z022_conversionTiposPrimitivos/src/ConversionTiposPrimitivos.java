
import java.util.Scanner;

public class ConversionTiposPrimitivos {
    public static void main(String args[]){
        var edadTexto = String.valueOf(10);
        System.out.println("Edadtexto: " + edadTexto);
        
        var caracter = "hola".charAt(3);
        System.out.println(caracter);
        
        System.out.println("Proporciona un caracter:");
        var consola = new Scanner(System.in);
        caracter = consola.nextLine().charAt(0);
        System.out.println(caracter);
                
    }    
}
