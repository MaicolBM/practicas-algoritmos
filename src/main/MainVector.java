package main;
import datos.Vector ; 

public class MainVector {
    public static void main (String[] args) 
    {
      //  float a[2] = [1,2] ; 

        Vector uno = new Vector(2) ; 
        Vector dos = new Vector(2) ; 

        uno.suma(dos);

        dos.escalar(5);

       //  uno.productoPunto(dos);


        System.out.println(uno) ;

        System.out.println(dos) ; 
        
    }
}