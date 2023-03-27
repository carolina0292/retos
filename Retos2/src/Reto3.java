
import java.util.Scanner;
public class Reto3 {

        public static void main(String[] args) {

             Scanner lectura = new Scanner(System.in);

             int contador = 0;
            int paresEncontrados = 0;
            int fila1;
            int columna1;
            int fila2;
            int columna2;

            String[][] matriz = {{"GATO", "PERRO","ELEFANTE"},
                                 {"JABALI", "COCODRILOS", "PERRO"},
                                 {"CHINMPANCE", "JABALI", "GATO"},
                                 {"CHINMPANCE",  "COCODRILOS", "ELEFANTE"}};
    
            String[][] matrizJuego = new String[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matrizJuego[i][j] = "*";
                }
            }
    

    

    
            while (paresEncontrados < 6) {
                System.out.println("Intentos: " + contador);
                imprimirMatriz(matrizJuego);
    
                System.out.print("Ingrese la fila de la primera palabra: ");
                fila1 = lectura.nextInt();
                System.out.print("Ingrese la columna de la primera palabra: ");
                columna1 = lectura.nextInt();
    
                System.out.print("Ingrese la fila de la segunda palabra: ");
                fila2 = lectura.nextInt();
                System.out.print("Ingrese la columna de la segunda palabra: ");
                columna2 = lectura.nextInt();
    
                if (matriz[fila1][columna1].equals(matriz[fila2][columna2])) {
                    matrizJuego[fila1][columna1] = matriz[fila1][columna1];
                    matrizJuego[fila2][columna2] = matriz[fila2][columna2];
                    paresEncontrados++;
                } else {
                    System.out.println("Las palabras no coinciden. Intenta de nuevo.");
                    contador++;
                }
            }
    
            System.out.println("¡Felicidades! Has encontrado todos los pares en " + contador + " intentos.");
        }
    
        public static void imprimirMatriz(String[][] matriz) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
    