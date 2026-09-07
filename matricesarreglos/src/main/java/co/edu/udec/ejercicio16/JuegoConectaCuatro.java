package co.edu.udec.ejercicio16;

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
}
