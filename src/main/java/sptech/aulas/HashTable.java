package sptech.aulas;
 
import sptech.exercicios.lista03.LinkedList;
import sptech.exercicios.lista03.Node;

public class HashTable {

    // attribute
    private LinkedList[] tab;

    public int hashFunction(int x) {
        return x % tab.length;
    }

    public HashTable() {
        this(4);
    }
    public HashTable(int length) {
        tab = new LinkedList[length];
        
        for (int i = 0; i < length; i++) {
            tab[i] = new LinkedList();
        }
    }

    public void insert(Integer value) {
        tab[hashFunction(value)].insert(value);
    }

    public Node search(int value) {
        return tab[hashFunction(value)].search(value);
    }

    public boolean remove(int value) {
        return tab[hashFunction(value)].remove(value);
    }

    public void display() {
        for (int i = 0; i < this.tab.length; i++) {
            System.out.println(tab[i].getHead());
        }
    }
}
