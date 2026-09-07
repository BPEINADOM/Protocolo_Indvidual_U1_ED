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
    }
}
