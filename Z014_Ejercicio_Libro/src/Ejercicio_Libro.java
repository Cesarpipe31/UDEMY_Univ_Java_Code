/*Se solicita incluir la siguiente información acerca de un libro:

titulo
autor

Debes imprimir la información en el siguiente formato:

Proporciona el titulo:
Proporciona el autor:
<titulo> fue escrito por <autor>

Puedes utilizar el IDE de tu preferencia para desarrollar la solución y después pegar aquí tu respuesta, ya que este editor no contiene ningún tipo de ayuda.

Questions for this assignment
¿Cuál es el código del requerimiento solicitado?
*/

import java.util.Scanner;

public class Ejercicio_Libro {
    public static void main(String args []){
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }    
}
