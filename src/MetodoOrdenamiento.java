import java.util.Scanner;

public class MetodoOrdenamiento {

    public int[] crearArray() {
        Scanner leer = new Scanner(System.in);
        int tamanio = leerEnteroValido(leer, false); 


        int[] arreglo = new int[tamanio];


        System.out.println("Ingrese " + tamanio + " números enteros:");
        for (int i = 0; i < tamanio; i++) {
            arreglo[i] = leerEnteroValido(leer, true); 
        }

        return arreglo;
    }

    
    public void sortBubbleMe(int[] arreglo) {
        int m = arreglo.length;
        boolean intercambio;
        int aux;

        for (int i = 0; i < m - 1; i++) {
            intercambio = false;
            System.out.println("Pasada " + (i + 1));

            for (int j = 0; j < m - 1 - i; j++) {
                System.out.println("Comparando arreglo[" + j + "]=" + arreglo[j] + " y arreglo[" + (j + 1) + "]=" + arreglo[j + 1]);

                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;

                    System.out.println("Intercambio realizado: " + arreglo[j] + " con " + arreglo[j + 1]);
                }
            }

            if (!intercambio) {
                System.out.println("No hubo intercambios, el arreglo está ordenado.");
                break;
            }
        }
    }

    public void printArreglo(int[] arreglo) {
        System.out.println("Arreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static int leerEnteroValido(Scanner s, boolean numerosNegativos) {
        int numero;
        do {
            System.out.println("Ingrese un número entero" + (numerosNegativos ? " (se permiten negativos):" : " positivo:"));
            while (!s.hasNextInt()) {
                System.out.println("Te solicité un Entero Válido");
                s.next();
            }
            numero = s.nextInt();
            if (!numerosNegativos && numero <= 0) {
                System.out.println("El número debe ser positivo.");
            }
        } while (!numerosNegativos && numero <= 0);

        return numero;
    }
}
