package colecciones.cola;

public class ColaCircular <T> implements ColaDoble <T> 
{
    private static final int MAX_ITEMS = 5 ; 
    private static final int NULL = -1 ; 
    private int init,end,cantElem ; 
    private Object[] items ; 

    public ColaCircular() 
    {
       items = new Object[MAX_ITEMS] ; 
       cantElem = 0 ; 
       init = end = NULL ;
    }

    @Override
    public void encolarInit(T elem) {
            cantElem ++ ;
            items[end] = elem ; 
            end = (end + 1) % MAX_ITEMS ; 
    }

    @Override
    public void encolarFin(T elem) {
        if (cantElem != MAX_ITEMS) 
        {
            items[cantElem] = elem ; 

        }
    }

    @Override
    public void desencolarInit() {
        items[init+1] = null ;
        init ++ ; 
        if (init == end) 
        {
            init = MAX_ITEMS ; 
        }
     }

    @Override
    public void desencolarFin() {
        items[end -1] = null ; 
        end = end -- ;
        if (init == end) 
        {
            end = 0 ;
        }
        
    }

    @Override
    public Boolean esVacia() {

        return (cantElem == 0) ;
    }

    @Override
    public String toString() 
    {
        String str = "|" ; 
        for (int i = 0 ; i < cantElem ; i ++) 
        {
            str = str + items[i] + " " ;  
        }

        str = str + "|" ; 
        return str ; 

    }

}