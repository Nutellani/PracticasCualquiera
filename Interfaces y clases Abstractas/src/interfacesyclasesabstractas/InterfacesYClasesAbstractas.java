package interfacesyclasesabstractas;

import java.util.Scanner;

public class InterfacesYClasesAbstractas {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Cat gato1 = new Cat();
        Cat gato2 = ingresarCat();
        
        
        System.out.println(gato1);
        System.out.println(gato2);

    }

    // ahora usando un metodo para add gatos
    public static Cat ingresarCat() {

        String name;
        int age;
        Integer numeroDeColas;

        System.out.print("Nombre del gato 2: ");
        name = sc.nextLine();
        System.out.print("Edad del gato 2: ");
        age = sc.nextInt();
        System.out.print("Numero de colas del gato 2: ");
        numeroDeColas = sc.nextInt();

        return new Cat(name, age, numeroDeColas);
    }
}
