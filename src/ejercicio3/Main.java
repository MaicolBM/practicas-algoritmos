package ejercicio3;


public class Main {
    
    public static void main(String args[]){

        Libro l1 = new Libro("The Lord of the Rings", "J. R. R. Tolkien", 1000);
        Libro l2 = new Libro("Harry Potter", "J. K. Rowling", 600);
        Libro l3 = new Libro("Kawasaki", "KKK", 1200);
        Libro l4 = new Libro("Jupiter", "Astronaut Industries", 100);
        Libro l5 = new Libro("Music Interpretation", "Arcangel", 525);
        Catalogo c1 = new Catalogo();
        c1.agregarLibro(l1);
        c1.agregarLibro(l2);
        c1.agregarLibro(l3);
        c1.agregarLibro(l4);
        c1.agregarLibro(l5);

        if(c1.buscarPorTitulo("Kawasaki") != null)
        {
            System.out.println ("Se encontro !!") ;
        } 

        


        System.out.println("Catalogo 1:");
        c1.mostrar();

   }

}
