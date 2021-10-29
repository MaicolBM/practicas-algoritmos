package colecciones.cola;

public class CPrioridad <T extends Comparable> implements ColaPrioridad <T> {

    private static int MAX_ITEMS = 10 ; 
    private Object[] items ; 
    private int cantElem ; 
    private int index ; 

    public CPrioridad () 
    {   
        items = new Object[MAX_ITEMS] ;
        cantElem = index = 0 ; 
    }
    @Override
    public boolean insertar(T elem) {
        if (empty()) 
        {
            
            items[cantElem] = elem ; 
            index ++ ; 
            return true ; 
             
        }
        else 
        {
            
        }
        return false;
    }

    @Override
    public boolean rm() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean empty() {
        return (cantElem == 0) ;
    }
    
}
