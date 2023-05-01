/*  
En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo,
para ello deberemos crear las siguientes variables:

        alto (int)

        ancho (int)

El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir 
el resultado en el siguiente formato(no usar acentos y respetar los espacios, mayúsculas, 
minúsculas y saltos de línea):

        Proporciona el alto:
        Proporciona el ancho:
        Area: <area>
        Perimetro: <perimetro>

Las fórmulas para calcular el área y el perímetro de un Rectángulo son:

Área: alto * ancho
Perímetro: (alto + ancho) * 2

Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu 
solución en esta herramienta.
 */
package z031_areaperimetrorectangulo;

import java.util.Scanner;


public class Z031_areaPerimetroRectangulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Integer alto, ancho, area, perimetro;
        System.out.println("Proporciona el alto:");
        alto = leer.nextInt();
        System.out.println("Proporciona el ancho:");
        ancho = leer.nextInt();
        area = alto * ancho;
        perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
    
}
