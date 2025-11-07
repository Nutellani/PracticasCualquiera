package asociacion1a1bidirecional;

public class Matricula {

    private String numero;
    private Coche coche;

    public Matricula() {
    }

    public Matricula(String numero) {
        this.numero = numero;
    }

    // ############## GETERS N SETTERS ##############
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
        if (coche.getMatricula() != this) {
            coche.setMatricula(this);
        }
    }

    // ############## METHODS ##############
    @Override
    public String toString() {
        return ("Matrícula: " + numero + ", del Coche: " + coche.getModelo());
    }

}
