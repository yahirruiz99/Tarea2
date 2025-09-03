public class Main {
    public static void main(String[] args) {
        int[] lista = {8, 2, 15, 5, 6, 15, 150};
        int buscado = 10;

        int totalComparaciones = BusLineal.encontrar(lista, buscado);
        System.out.println("Total de comparaciones hechas: " + totalComparaciones);
    }
}
