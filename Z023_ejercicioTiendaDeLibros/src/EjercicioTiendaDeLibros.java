/*
Se solicita capturar la siguiente información de una tienda de libros:

nombre (String)

id (int)

precio (double)

envioGratuito (boolean)

Tu tarea es imprimir un mensaje en el siguiente formato:

Proporciona el nombre:
Proporciona el id:
Proporciona el precio:
Proporciona el envio gratuito:
<nombre> #<id>
Precio: <simbolo><precio>
Envio Gratuito: <envioGratuito>
Por ejemplo:

Proporciona el nombre:
Programacion con Java
Proporciona el id:
1520
Proporciona el precio:
899
Proporciona el envio gratuito:
true
Programacion con Java #1520
Precio: $899.00
Envio Gratuito: true
Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.

Questions for this assignment
¿Cuál es el código del requerimiento solicitado?
*/

//import java.util.Scanner;
//
//public class EjercicioTiendaDeLibros {
//    public static void main(String [] args){
//
//        Scanner consola = new Scanner(System.in);
//        System.out.println("Proporciona el nombre:");
//        var nombre = consola.nextLine();        
//        
//        System.out.println("Proporciona el id");
//        var id = consola.nextLine();        
//        
//        System.out.println("Proporciona el precio");
//        var precio = consola.nextLine();        
//        
//        System.out.println("Proporciona el envío gratuito:");
//        var envioGratuito = consola.nextLine();
//                
//        System.out.println("Proporciona el nombre:");
//        System.out.println(nombre);
//        System.out.println("Proporciona el id:");
//        System.out.println(id);
//        System.out.println("Proporciona el precio:");
//        System.out.println(precio);        
//        System.out.println("Proporciona el envio gratuito:");
//        System.out.println(envioGratuito);        
//    }    
//}

//import java.util.Scanner;
//
//public class EjercicioTiendaDeLibros {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Proporciona el nombre:");
//        String nombre = scanner.nextLine();
//        System.out.println("Proporciona el id:");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Proporciona el precio:");
//        double precio = Double.parseDouble(scanner.nextLine());
//        System.out.println("Proporciona el envio gratuito:");
//        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
// 
//        System.out.println(nombre + " #" + id);
//        System.out.println("Precio: $" + precio);
//        System.out.println("Envio Gratuito: " + envioGratuito);
//    }
//}



import java.util.Scanner;
 
public class EjercicioTiendaDeLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}