package datos;

public class RacionalInt  implements Racional<RacionalInt> {

    private int num ;
    private int den ;

    public RacionalInt (int numerador, int denominador) {
        if (denominador == 0) { throw new IllegalArgumentException("El denominador NO puede ser 0") ; }
        
        // Exception numerator
        if (num < 0) { throw new IllegalArgumentException(" El numerador no puede ser negativo ") ; }
        
        // Exception negative 
        if (den < 0) { den = -den ; num = -num ; }
        
        
        num = numerador ;
        den = denominador ; 

    }


    @Override
    public void sumar(RacionalInt otro) {
        
         num = (num * otro.den) + (den * otro.num)  ;
         den = den * otro.den ; 
         
        
    }

    @Override
    public void multiplicar(RacionalInt otro) {
        num = num * otro.num ; 
        den = den * otro.den ; 
        
    }

    @Override
    public void negar() {
        
        num *= (-1) ;
        
    }

    @Override
    public void dividir(RacionalInt otro) {

        if (otro.den == 0) { throw new ArithmeticException("NO intente dividir por 0") ; } 

        RacionalInt aux = new RacionalInt(otro.den, otro.num) ; 
        multiplicar(aux) ; 
        
    }

    @Override
    public boolean repOk() {
        return den != 0 ;
    }

    @Override
    public boolean equals (Object otro) {
        
        if (otro == null) { return false ; }
        
        if (!(otro instanceof RacionalInt )) { return false ; }
        
        if (otro == this)  { return true ; } 

        RacionalInt otroRacional = (RacionalInt) otro ;
        
        return compareTo(otroRacional) == 0; 

        /*    
        
         RacionalEntero otroRacional = (RacionalEntero) otro;
        if(otroRacional.numerador == 0)
            return numerador == 0;
        return (numerador * otroRacional.denominador == denominador * otroRacional.numerador);
        
        // O sea, se fija si this dividido otro = 1 
        
        */

        
    }   

    // a.compareTo(b) == 0 sii a.equals(b)
    @Override
    public int compareTo(RacionalInt otro) {
        RacionalInt a = this ;
        int f = a.num * otro.den ; 
        int s = a.den * otro.num ; 
        
        if (f < s) return -1 ;
        if (f > s) return 1 ;

        return 0;
    }
    
    @Override
	public String toString() {
        return num + "/" + den ; 
    }
/*
    public int mcd (int x , int y) 
    {
        int a = x ; int b = y ; 
        while (!(a == b) && a!=0) 
        {
            if (a > b) { a = a - b ; }
            else { b = b - a ; }
        }
        return a ; 
    }

    public void simplificar () {
        int d = mcd(num,den) ; 

        num = num / d ; 
        den = den / d ; 
    }
 */   
}   
