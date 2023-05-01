/*
El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:

El usuario proporcionará un valor entre 0 y 10.

Si está entre 9 y 10: imprimir una A
Si está entre 8 y menor a 9: imprimir una B
Si está entre 7 y menor a 8: imprimir una C
Si está entre 6 y menor a 7: imprimir una D
Si está entre 0 y menor a 6: imprimir una F
cualquier otro valor debe imprimir: Valor desconocido

Por ejemplo:
Proporciona un valor entre 0 y 10:
A
 */
package z038_sistemadecalificaciones;

import java.util.Scanner;

public class Z038_sistemaDeCalificaciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la calificación entre 0 y 10: ");
        float opcion = leer.nextFloat();

        if (opcion >= 9 && opcion <= 10) {
            System.out.println("A");
        } else if (opcion >= 8 && opcion < 9) {
            System.out.println("B");
        } else if (opcion >= 7 && opcion < 8) {
            System.out.println("C");
        } else if (opcion >= 6 && opcion < 7) {
            System.out.println("D");
        } else if (opcion >= 0 && opcion < 6) {
            System.out.println("F");
        } else {
            System.out.println("Valor desconocido");
        }
    }
}
