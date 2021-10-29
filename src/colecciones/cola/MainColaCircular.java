package colecciones.cola;

public class MainColaCircular {
    public static void main(String[] args) 
    {   
        ColaCircular<Integer> nuevacola = new ColaCircular<Integer> () ;
        nuevacola.encolarInit(5);
        nuevacola.encolarFin(8);
        nuevacola.encolarInit(4);
        nuevacola.encolarFin(6);  
        System.out.println(nuevacola) ; 


    }
}
