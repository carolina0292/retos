import java.util.Scanner;

public class Reto2 {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int numCompetidores;
        int indiceGanador;
        

        System.out.print("Ingrese la cantidad de competidores: ");
         numCompetidores = lectura.nextInt();

        String[] nombres = new String[numCompetidores];
        double[] tiempos = new double[numCompetidores];

        for (int i = 0; i < numCompetidores; i++) {
            System.out.print("Ingrese el nombre del competidor " + (i+1) + ": ");
            nombres[i] = lectura.next();

            System.out.print("Ingrese el tiempo del competidor " + (i+1) + ": ");
            tiempos[i] = lectura.nextDouble();
        }

        for (int i = 0; i < numCompetidores; i++) {
            System.out.println("Competidor " + nombres[i] + " - Tiempo: " + tiempos[i]);
        }

        indiceGanador = 0;
        for (int i = 1; i < numCompetidores; i++) {
            if (tiempos[i] < tiempos[indiceGanador]) {
                indiceGanador = i;
            }
        }

        System.out.println("El ganador es " + nombres[indiceGanador] + " con un tiempo de " + tiempos[indiceGanador] + " segundos.");
    }
}

