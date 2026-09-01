package co.edu.udec.matrices;

public class EjercicioMatrices {
    public static void main(String[] args) {

        // Creamos la matriz
        int[][] matriz = new int[3][3];

        // Inicializamos la matriz con valores del 1 al 9
        int valor = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }
    }
}
