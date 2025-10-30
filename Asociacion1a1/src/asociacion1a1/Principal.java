package asociacion1a1;

public class Principal {

    public static void main(String[] args) {
        
        Pasaporte pasaporte = new Pasaporte("#ASDFA-LEL");
        Persona persona = new Persona("Maltriz", pasaporte);
        
        System.out.println(persona);
        
    }

}
