package main;

// import queue.ArrayQueue;
import queue.ListQueue; 


public class Palindro {
        

    public static boolean EsPalindro(String[] args) {
        
        if (args[0].isEmpty())
            return false ;
        ListQueue<Character> cola = new ListQueue<Character>() ; 
        
        String reverse = ""; 
        int j = 0 ; 

        for (int i = args[0].length() - 1 ; i >= 0 ; i --) 
        {
            cola.enqueue(args[0].charAt(i)) ;
            reverse = reverse + cola.getEnd() ; 
            if (args[0].charAt(j) != reverse.charAt(j)) return false ;
            j ++ ; 
        }

        return true ; 
        
    }
    
}
