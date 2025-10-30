package asociacion1a1;

public class Persona {

    String nombre;
    Pasaporte pasaporte;
    
    public Persona() {
    }

    public Persona(String nombre, Pasaporte pasaporte) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    // ############## GETTERS N SETTERS ##############

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    // ############## toString ##############
    
    @Override
    public String toString() {
        return ("Nombre: " + this.nombre + ", de pasaporte: " + this.pasaporte.nombre);
    }
    
}
