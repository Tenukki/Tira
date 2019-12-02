package linkedlist;

import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.ListIterator;

public class Stack {
    private int size;
    private LinkedList<String> lista;

    public Stack() {
        lista = new LinkedList<>();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    

    // Muodostetaan uusi lista-alkio, asetetaan se pinon huipulle
    public void push (String aData) {
        lista.add(aData);
        size++;
    }

    // Poistetaan lista-alkio pinon huipulta, jos pino tyhjä, palautetaan null
    public String pop() {
        if(size > 0){
            size--;
            String palauta = lista.get(size);
            lista.remove(size);
            return palauta;
        }
        System.out.println("null");
        return null;
       
    }

    @Override
    public String toString() {
        
        ListIterator list_Iter = lista.listIterator(0); 
  
        // Iterating through the created list from the position 
        String lista = "";
        while(list_Iter.hasNext()){ 
           lista += list_Iter.next() + "\n";
        } 
        
        return lista;
    }
}
