package pruebatostring;

public class Chancho {

    private String nombre = "Pato";
    private Integer edad = 8;
    private String duenio = "Arnaldo";

    public Chancho() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    @Override
    public String toString() {
        return ("Nombre: " + this.nombre + ", edad " + edad + " años y el dueño es: " + duenio);
    }

}
