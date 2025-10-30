package asociacion1a1bidirecional;

public class Coche {

    private String modelo;
    private Matricula matricula; //Asociacion 1 a 1

    public Coche() {
    }

    public Coche(String modelo) {
        this.modelo = modelo;
    }

    // ############## GETERS N SETTERS ##############
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
        if (matricula.getCoche() != this) {
            matricula.setCoche(this);
        }
    }

    // ############## METHODS ##############
    @Override
    public String toString() {
        return ("Modelo: " + modelo + ", de la matricula: " + matricula.getNumero());
    }

}
