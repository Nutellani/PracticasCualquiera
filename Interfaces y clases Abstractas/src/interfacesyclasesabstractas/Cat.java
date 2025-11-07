package interfacesyclasesabstractas;

public class Cat extends Animal implements AnimalStuff {

    private int numeroDeVidas;

    public Cat() {
        super();
    }

    public Cat(String name, int age, int numeroDeColas) {
        super(name, age);
        this.numeroDeVidas = numeroDeColas;
    }

    @Override
    public String toString() {
        return "\nGato: " + this.getName() + " " + this.getAge() + " de edad, de " + numeroDeVidas + " vidas";
    }

}
