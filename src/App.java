public class App {

    public static void main(String[] args) {

        // Crear una instancia de MetodoOrdenamiento
        MetodoOrdenamiento metodo = new MetodoOrdenamiento();

        // Crear el arreglo
        int[] array = metodo.crearArray();

        System.out.println();

        // Ordenar el arreglo
        metodo.sortBubbleMe(array);

        System.out.println();

        // Imprimir el arreglo ordenado
        metodo.printArreglo(array);
    }
}