package asociacion1a1bidirecional;

public class Asociacion1a1Bidirecional {

    public static void main(String[] args) {

        Matricula matricula = new Matricula("AB123CD");
        Coche coche = new Coche("Mustang");

        coche.setMatricula(matricula);
        matricula.setCoche(coche);

        System.out.println(matricula);
        System.out.println(coche.toString());
        System.out.println("LEYENDO DESDE MATRICULA: Modelo " + matricula.getCoche().getModelo());
        System.out.println("LEYENDO DESDE COCHE: Matricula " + coche.getMatricula().getNumero());
    }

}
