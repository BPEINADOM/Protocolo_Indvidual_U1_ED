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
    }
}
