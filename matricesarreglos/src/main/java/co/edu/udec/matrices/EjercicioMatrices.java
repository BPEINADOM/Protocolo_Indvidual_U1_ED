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

        // Suma de los elementos de la matriz
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        System.out.println("\nSuma de los elementos de la matriz: " + suma);

        // Intercambio de la primera fila por la ultima

        int[] filaTemp = matriz[0];

        matriz[0] = matriz[matriz.length - 1];

        matriz[matriz.length - 1] = filaTemp;

        // Imprimimos la matriz despues del intercambio
        System.out.println("\nMatriz despues del intercambio de filas:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
