
import java.util.Scanner;

public class ConversionTipos {
    public static void main(String arg[]){
        var edad = Integer.parseInt(("20"));
        System.out.println("edad: " + (edad + 1));
        
        var edad1 = "20";
        System.out.println("edad: " + (edad + 1));
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("Valor Pi: " + valorPi);
        
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("Edad:  " + edad);
    }
}
