package pl.edu.ur.oopl5.stack;

import java.util.EmptyStackException;   

/**
 */
public class Stack extends AbstractStack {
    
    int n;
    int[] tab=new int[n];
    int index=tab[0];

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getTab() {
        return tab;
    }

    public void setTab(int[] tab) {
        this.tab = tab;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Stack(int n) {
        this.n = n;
    }
    
    
    @Override
    public void push(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        if(tab==null)
            return true;
        else
            return false;
    }
    
}
