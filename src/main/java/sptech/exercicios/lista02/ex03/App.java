package sptech.exercicios.lista02.ex03;

public class App {
    
    public static void main(String[] args) {
        Integer[] unsorted = {-1, -2, -3, -4, 1, 5, 2};
        // PilhaFila stackQueue = addItemsToStackQueue(unsorted);
        // stackQueue.displayAll();

        PilhaFila stack = new PilhaFila(5);
        stack.insert(1);
        stack.insert(2);
        stack.insert(3);
        System.out.println(stack.isEmpty(2));
        stack.displayAll();
    }
    
    public static PilhaFila addItemsToStackQueue(Integer[] unsorted) {
        PilhaFila stackQueue = new PilhaFila(unsorted.length);
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println(i + ", " + unsorted[i]);
            if (unsorted[i] >= 0) {
                stackQueue.insert(unsorted[i]);
            } else {
                stackQueue.push(unsorted[i]);
            }
        }
        return stackQueue;
    }

}
