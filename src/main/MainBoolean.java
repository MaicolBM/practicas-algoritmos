package main;
import datos.Boolean;
public class MainBoolean {
    
    public static void main (String[] args) 
    {
        Boolean n,m ; 
        
        n = new Boolean () ; 
        m = new Boolean () ; 

        n.verdadero(); 
        m.verdadero();

        n.conjuncion(1) ;
        m.disyuncion(2) ; 

        System.out.println(n);

        System.out.println(m); 

    




    }
}
