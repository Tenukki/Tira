/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackIterator;

import java.util.ArrayList;
import java.util.List;


public class Stack {

    ListItem top; 
    private int size;
    private int index = 0;

    public String[] taulukko = new String[10];

    public String[] getTaulukko() {
        return this.taulukko;
    }

    public StackIterator iterator() {
        return new StackIterator(taulukko);
    }

    public Stack() {
        top = null;
        size = 0;
    }
  

    public void raiseIndexBy1() {
        this.index = this.index + 1;
    }

    public int getIndex() {
        return index;
    }
    
    public void push(String aData) {
        taulukko[index] = aData;
        index++;
    }
    

    public String pop() {
        index--;
        return taulukko[index];

    }
    
    public int amount() {
        return index;
    }
    

    public void printItems() {
        for (int i = 0; i < index; i++) {
            System.out.println(taulukko[i]);
        }
    }
}
