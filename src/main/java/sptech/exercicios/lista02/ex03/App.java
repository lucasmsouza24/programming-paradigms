package sptech.exercicios.lista02.ex03;

public class App {
    
    public static void main(String[] args) {
        Integer[] unorganized = {-1, -2, -3, -4, 1, 5, 2};
        PilhaFila stackQueue = addItemsToStackQueue(unorganized);
        // System.out.println(stackQueue.poll());
        
        // exibindo ordenado
        stackQueue.displayAll();

        // exibindo com as ordem inversas
        ordensInversas(stackQueue);
    }
    
    public static PilhaFila addItemsToStackQueue(Integer[] unorganized) {
        PilhaFila organized = new PilhaFila(unorganized.length);
        for (int i = 0; i < unorganized.length; i++) {
            // System.out.println(i + ", " + unorganized[i]);
            if (unorganized[i] >= 0) {
                organized.insert(unorganized[i]);
            } else {
                organized.push(unorganized[i]);
            }
        }
        return organized;
    }

    public static void ordensInversas(PilhaFila structure) {

        System.out.println("ordem inversa");

        // stack
        while(structure.isNotEmpty(1)) {
            System.out.print(structure.pop() + ", ");
        }

        // queue
        while(structure.isNotEmpty(2)) {
            System.out.print(structure.poll() + ", ");
        }
    }
}
