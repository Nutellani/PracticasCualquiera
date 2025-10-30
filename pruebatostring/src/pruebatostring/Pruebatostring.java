package pruebatostring;

public class Pruebatostring {

    public static void main(String[] args) {
        
        Chancho chancho1 = new Chancho();
        
        System.out.println(chancho1); // acá se usa implícitamente lo sgte, ya que se implementó el @Override del metodo toString en su debida clase...
        //  System.out.println(chancho1.toString);
        
    }

}
