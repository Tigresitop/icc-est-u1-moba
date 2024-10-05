public class App {

    public static void main(String[] args) {

        MetodoOrdenamiento metodo = new MetodoOrdenamiento();

        int[] array = metodo.crearArrays();

        System.out.println();

        metodo.sortBubbleMe(array);

        System.out.println();

        metodo.printArreglo(array);
    }
}