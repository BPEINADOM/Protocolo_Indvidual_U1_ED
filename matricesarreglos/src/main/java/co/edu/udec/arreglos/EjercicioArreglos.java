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
    }
}
