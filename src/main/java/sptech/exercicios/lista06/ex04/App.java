package sptech.exercicios.lista06.ex04;

import sptech.exercicios.lista06.LinkedList;

public class App {
    
    public static void main(String[] args) {
        
        LinkedList linked = new LinkedList();
        int[] array = {30, 50, 6, 90, 110};
        linked.arrayToList(array);

        linked.display();
    }
}
