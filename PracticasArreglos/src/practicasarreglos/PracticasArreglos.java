package practicasarreglos;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PracticasArreglos {

    public static Scanner sc = new Scanner(System.in).useDelimiter("\n"); // De esta manera hago la variable sc ESTATICA para poder ser usada en toda la clase
    public static Random random = new Random();

    public static void main(String[] args) {

        // Array: Arreglo NO DINÁMICO y recorrerlo con length SIN () xq NO es una Coleccion
        int[] numerosArray = new int[8];

        for (int i = 0; i < numerosArray.length; i++) {

            numerosArray[i] = random.nextInt(101); // numero random entre 0 y 100 xq hay q contar desde el 0

            if (i == numerosArray.length - 1) {
                System.out.print("Ingrese el ultimo numero a agregar en el Array: ");
                numerosArray[i] = Service.llamarSc(); // se llama a la clase Service primero xq no hay objeto instanciado por donde ingresar a ella y suar el sc
            }
        }

        System.out.println("Array Ordenado de MENOR a MAYOR:");
        Arrays.sort(numerosArray);
        for (int i = 0; i < numerosArray.length; i++) {
            System.out.println(numerosArray[i]);
        }

        System.out.println("\nFin Array\n");

        // ArrayLIST: Arreglo DINÁMIMCO de SOLO OBJETOS agregar, recorrer y borrar elementos        
        ArrayList<Integer> numerosArrayLIST = new ArrayList<>();

        numerosArrayLIST.add(83);

        for (Integer i = 0; i < 10; i++) {
            numerosArrayLIST.add(random.nextInt(101));
        }

        for (Integer elemento : numerosArrayLIST) {
            System.out.println(elemento);
        }

        System.out.println("\nFin ArrayLIST\n");

        // (STACK) Pila Push Search Pop
        Stack<Integer> pila1 = new Stack<>();

        pila1.push(45);
        pila1.push(44);
        pila1.push(43);
        pila1.push(42);
        pila1.push(41);

        System.out.println("Pila vacía " + pila1);
        System.out.println("Pila vacía? " + pila1.isEmpty());

        System.out.println("Ultimo elemento x salir.. " + pila1.peek());
        pila1.pop();
        System.out.println("Ultimo elemento x salir.. " + pila1.peek() + "\n");
        
        System.out.println("\nFin Stack\n");

        // (Queue) Cola Offer
        Queue<Integer> colaIntegers = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            colaIntegers.offer(random.nextInt(1000));
        }

        System.out.println(colaIntegers);
        colaIntegers.remove();
        colaIntegers.poll();
        System.out.println(colaIntegers); // sin los 2 primeros en llegar (cola de supermercado)

        System.out.println("\nFin Queue\n");
    }

}
