package main;
import colecciones.pila.PilaDinamica;
public class MainPilaDinamica extends PilaDinamica <String> {
    public static void main(String[] args) {

        PilaDinamica<String> prueba = new PilaDinamica<String>() ; 
        prueba.apilar("Hola") ; 
        prueba.apilar("Mundo") ; 
        System.out.println(prueba);
        prueba.desapilar() ; 
        System.out.println(prueba);

        


    }
}
