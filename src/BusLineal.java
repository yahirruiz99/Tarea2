public class BusLineal {
    public static int encontrar(int[] arreglo, int objetivo) {
        int comparaciones = 0;
        int posicion = -1;

        for (int i = 0; i < arreglo.length; i++) {
            comparaciones++;
            if (arreglo[i] == objetivo) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("Número " + objetivo + " encontrado en la posición " + posicion);
        } else {
            System.out.println("Número " + objetivo + " no se encuentra en el arreglo");
        }

        return comparaciones;
    }
}


