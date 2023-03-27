    import java.util.Scanner;// importa la clase Scanner de Java para poder leer entradas del usuario.

public class Reto4 {
    
    public static void main(String[] args) {
        //crea un objeto de tipo Scanner llamado "lectura" que se utilizará para leer las entradas del usuario.
        Scanner lectura = new Scanner(System.in);
        //se declara un array de tamaño 16x3 llamado "catalogo", que se utilizará para almacenar los datos de los productos.
        String[][] catalogo = new String[16][3]; 

        
//se utiliza un bucle for para pedir al usuario que ingrese el nombre y el precio de cada uno de los 16 productos. Los datos se almacenan en el array "catalogo".
        for (int i = 0; i < 16; i++) {
            System.out.print("Ingrese el nombre del producto #" + (i+1) + ": ");
            catalogo[i][1] = lectura.nextLine();
            System.out.print("Ingrese el precio del producto #" + (i+1) + ": ");
            catalogo[i][2] = lectura.nextLine();
            catalogo[i][0] = Integer.toString(i+1); 
        }
        
        System.out.println("Catálogo de productos:");
        System.out.println("Código\tNombre\t\tPrecio");

        //se utiliza otro bucle for para imprimir el catálogo de productos 
        for (int i = 0; i < 16; i++) {
            System.out.println(catalogo[i][0] + "\t" + catalogo[i][1] + "\t" + catalogo[i][2]);
        }
    }
}


