package co.edu.udec.arreglos;

import java.util.Random;

public class EjercicioArreglos {
    public static void main(String[] args) {

        // Creamos el arreglo
        int[] numeros = new int[10];

        // Generamos numeros aleatorios
        Random random = new Random();

        // Usamos un for para llenar las posiciones del arreglo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50);
        }

        // Aplicamos el recorrido usando for

        // Recorrido usando for clasico
        System.out.println("Recorrido con for clasico");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Recorrido usando for-each
        System.out.println("\nRecorrido con for each");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Cambiar valores impares por cero
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 !=0) {
                numeros[i] = 0;
            }
        }

        // Imprimir el arreglo modificado
        System.out.println("\nArreglo cambiando impares por 0");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Multiplicamos todos los valores por su indice
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * i;
        }

        // Imprimir el arreglo con la multiplicacion por su indice
        System.out.println("\nArreglo despues de multiplicar por el indice:");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        // BUSQUEDA LINEAL

        // Inicializamos el numero que queremos buscar
        int buscado = 14;

        // Variable para almacenar la posicion del numero buscado
        int posicion = -1;

        // Recorremos el arreglo para buscar el numero
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                posicion = i;
                break;
            }
        }

        // Imprimimos el resultado de la busqueda
        if (posicion != -1) {           
            System.out.println("\nEl numero " + buscado + " se encuentra en la posicion: " + posicion);
        } else {
            System.out.println("\nEl numero " + buscado + " no se encuentra en el arreglo.");
        }
    }
}
