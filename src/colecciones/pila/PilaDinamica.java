package colecciones.pila;
import colecciones.Nodo;

public class PilaDinamica<T> implements Pila<T> {

    private Nodo<T> tope ; 
    private int cantElem ; 

    @Override
    public T tope() {
        return tope.dato() ; 
    }

    @Override
    public boolean esVacia() {
        return tope == null ;
    }

    @Override
    public boolean apilar(T elem) {
        Nodo<T> nuevo = new Nodo<T>(elem) ;
        if (esVacia())
        {
            nuevo.siguiente(null) ;
            tope = nuevo ; 
            cantElem ++ ;
            return true ; 
        } 
        else {  
            
            nuevo.siguiente(tope) ;
            tope = nuevo ;
            cantElem ++ ;
            return true ;
        }
    }

    @Override
    public T desapilar() {
        if (!esVacia()) 
        {   
            Nodo<T> tmp = new Nodo<T>(); 
            tmp = tope ; 
            tope = tope.siguiente() ; 
            cantElem -- ;
            return tmp.dato() ;

        }
        return null ; 
    }

    @Override
    public int elementos() {       
        return cantElem ;
    }

    @Override
    public void vaciar() {
        tope = null ;
        
    }

    @Override
    public boolean repOK() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString(){
        String str = "[" ; 
        Nodo<T> reco = tope ;
        while(reco != null)
        {
            str = str + reco.dato() + "," ; 
            reco = reco.siguiente() ; 
           
        }
        str += "]" ; 
        return str ; 

    }
    
}
