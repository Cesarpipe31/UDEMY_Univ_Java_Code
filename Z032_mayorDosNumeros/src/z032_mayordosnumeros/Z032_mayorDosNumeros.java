/*
Solicitar al usuario dos valores, y determinar cual número es el mayor

Solicitar al usuario dos valores:

numero1 (int)

numero2 (int)

Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):

Proporciona el numero1:
Proporciona el numero2:
El numero mayor es:
<numeroMayor>
Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
*/
package z032_mayordosnumeros;

import java.util.Scanner;

public class Z032_mayorDosNumeros {

    public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in);        
        System.out.println("Proporciona el numero1: ");
        int numero1 = leer.nextInt();
        System.out.println("Proporciona el numero2: ");
        int numero2 = leer.nextInt();
        
        System.out.println("El numero mayor es:" );
        System.out.println(numero1 > numero2 ? numero1 : numero2);                
    }    
}
