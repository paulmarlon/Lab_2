import java.util.Scanner;
public class lab_3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// 1. Pedir dimensiones de la matriz
System.out.print("Ingrese el número de filas: ");
int filas = scanner.nextInt();
System.out.print("Ingrese el número de columnas: ");
int columnas = scanner.nextInt();

// 2. Declarar y crear la matriz
int[][] matriz = new int[filas][columnas];
// 3. Llenar la matriz con datos del usuario

System.out.println("\n Ingrese los valores para la matriz:");
// Bucles anidados para recorrer filas y columnas
for (int i = 0; i < filas; i++) { // Recorre filas
for (int j = 0; j < columnas; j++) { // Recorre columnas
matriz[i][j] =0;
}
}

matriz[0][1] = 5;
matriz[1][2] = 9;
matriz[2][0] = 2;

// 4. Mostrar la matriz resultante
System.out.println("\n--- Matriz Resultante ---");
for (int i = 0; i < filas; i++) {
for (int j = 0; j < columnas; j++) {
System.out.print(matriz[i][j] + "\t"); // \t para alinear columnas
}
System.out.println(); // Salto de línea después de cada fila
}

// 4. Mostrar la matriz resultante
System.out.println("\n--- Matriz Resultante ---");
for (int i = 0; i < filas; i++) {
for (int j = 0; j < columnas; j++) {
    if(matriz[i][j] != 0){System.out.print("\n Matriz[" + i + "][" + j + "]= "+matriz[i][j]);}
}
}
scanner.close();
}
}

