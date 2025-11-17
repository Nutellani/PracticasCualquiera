package recursividadmetodoburbuja;

import java.util.Random;

public class RecursividadMetodoBurbuja {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[8];

        for (int i = 0; i < 8; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
            if (i != (array.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]\n");

        int aux;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }

        System.out.println("El arreglo se ordenó");
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
            if (i != (array.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]\n");
    }

}
