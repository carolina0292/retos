import java.util.Scanner;// importa la clase Scanner de Java para poder leer entradas del usuario.
public class Reto1 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);//crea un objeto de tipo Scanner llamado "lectura" que se utilizará para leer las entradas del usuario.
        int n;
        System.out.print("Ingrese la cantidad de números a verificar: ");
        n = lectura.nextInt();
        //crea un arreglo de enteros llamado "numeros" con una cantidad de números ingresados por el usuario.
        int[] numeros = new int[n];
        int contador = 0;
        //comienza un ciclo for que se ejecutará n veces (donde n es la cantidad de números ingresados por el usuario).
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = lectura.nextInt();
            if (numeros[i] % 2 == 0) {
                
            }
        }
        if (contador == n) {
            System.out.println("Todos los números ingresados son múltiplos de 2.");
        } else {
            System.out.println("No todos los números ingresados son múltiplos de 2.");
        }
    }
}

