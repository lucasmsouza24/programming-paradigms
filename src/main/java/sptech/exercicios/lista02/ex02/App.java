package sptech.exercicios.lista02.ex02;

public class App {
    
    public static void main(String[] args) {
        
        int[] mixed = {-3, 6, -4, 8, -1, 4, -2, 8, -9, 10};
        FilaPilha queueStack = new FilaPilha(mixed.length);

        // dividing values
        for (int value : mixed) {
            if (value < 0) {
                queueStack.insert(value);
            } else {
                queueStack.push(value);
            }
        }

        queueStack.displayAll();
        displayOnWishedOrder(queueStack);
        
    }

    public static void displayOnWishedOrder(FilaPilha queueStack) {

        while(queueStack.isNotEmpty(1)) {
            System.out.print(queueStack.poll() + ", ");
        }

        FilaPilha inverse = new FilaPilha(queueStack.size());

        while(queueStack.isNotEmpty(2)) {
            inverse.push(queueStack.pop());
        }

        while(inverse.isNotEmpty(2)) {
            System.out.print(inverse.pop() + ", ");
        }

        System.out.println("");
    }
}
