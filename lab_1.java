import java.util.Scanner;

public class lab_1 
    {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el número de posiciones vector: ");
            int posiciones = scanner.nextInt();
            int[] vector = new int[posiciones];
            System.out.println("\n Ingrese los valores para la matriz:");

            // Bucles anidados para recorrer filas y columnas
            int suma=0;
            for (int i = 0; i < posiciones; i++) 
            { // Recorre filas
                System.out.print("vector[" + i + "]: ");
                vector[i] = scanner.nextInt();
                suma=suma+vector[i];
            }
            double resultado=suma/posiciones;
            
            System.out.print("\n Promedio : " + resultado);
            if(resultado<70)
            {
                System.out.print("\n Necesitamos mejorar.");
            }
            if(resultado >= 70 && resultado < 90 )
            {
                System.out.print("\n Buen rendimiento.");
            }
            if(resultado >= 90 && resultado <= 100 )
            {
                System.out.print("\n \"¡Excelente clase!");
            }
        }
    }

