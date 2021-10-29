package colecciones.pila;


public class Main {
    
    public static void main(String[] args) 
    {
        Pila<String> miPila = new PilaArregloFijo<String>(5) ;  
        miPila.apilar("HOLA") ;
        miPila.apilar("MUNDO") ;
        System.out.println(miPila) ;


 






    }
}
