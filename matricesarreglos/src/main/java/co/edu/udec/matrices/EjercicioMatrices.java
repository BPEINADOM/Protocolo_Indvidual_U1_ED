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

        // Imprimimos la matriz
        System.out.println("Matriz 3x3:");

        // Hacemos con ciclo for para imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Recorrido de la matriz por columnas
        System.out.println("\nRecorrido por columnas:");

        // Ciclo for para recorrer las columnas y las filas de la matriz
        for(int j=0; j < matriz.length; j++) {
            for(int i=0; i < matriz.length; i++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
