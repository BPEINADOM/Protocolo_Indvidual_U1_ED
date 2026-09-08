package co.edu.udec.ejercicio16;

import java.util.Scanner;

public class JuegoConectaCuatro {
    
    public static void main(String[] args) {

        // Creamos el tablero de 6 filas y 7 columnas
        char[][] tablero = new char[6][7];

        // Inicializamos el tablero con espacios vacíos
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }

        // Mostramos el tablero inicial
        mostrarTablero(tablero);

        Scanner scanner = new Scanner(System.in);

        char ficha = 'X'; // Ficha del jugador 1
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            System.out.print("Jugador " + ficha + ", elige una columna (1-7): ");
            int columna = scanner.nextInt() - 1; // Restamos 1 para ajustar al índice del array

            // Validamos la columna ingresada
            if (columna < 0 || columna >= tablero[0].length) {
                System.out.println("Columna inválida. Intenta de nuevo.");
                continue;
            }

            // Intentamos insertar la ficha en la columna seleccionada
            if (!insertarFicha(tablero, columna, ficha)) {
                System.out.println("La columna está llena. Intenta de nuevo.");
                continue;
            }

            // Mostramos el tablero actualizado
            mostrarTablero(tablero);

            // Cambiamos de jugador
            ficha = (ficha == 'X') ? 'O' : 'X';
        }

        scanner.close();

    }

    public static void mostrarTablero(char[][] tablero) {
        System.out.println();

        for (int i = 0; i < tablero.length; i++) {
            System.out.print("|");

            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(" " + tablero[i][j] + "|");
            }

            System.out.println();
        }

        System.out.println(" 1  2  3  4  5  6  7");
    }

    public static boolean insertarFicha(char[][] tablero, int columna, char ficha) {

        // Recorrer la columna desde la última fila hasta la primera
        for (int i = tablero.length - 1; i >= 0; i--) {

            // Comprobar si la posicion esta vacia
            if (tablero[i][columna] == ' ') {

                // Colocar la ficha
                tablero[i][columna] = ficha;

                return true; // Ficha insertada correctamente
            }
        }
        return false; // No se pudo insertar la ficha
    }
}
