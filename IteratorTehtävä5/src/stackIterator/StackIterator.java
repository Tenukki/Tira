/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackIterator;


interface Iterator {

    boolean hasNext();

    Object next();
}

public class StackIterator implements Iterator {

    int current = 0;
    private Stack stack = new Stack();
    private String[] taulukko = stack.getTaulukko(); 

    StackIterator(String[] c) { 
        taulukko = c;
    }

  
    public boolean hasNext() {
        int tempCurrent = current;
        current++;
        return taulukko[tempCurrent] != null;
    }

   
    public String next() {
        int tempIndex = stack.getIndex();
        stack.raiseIndexBy1();
        return taulukko[tempIndex];
    }

}
