package sptech.exercicios.lista02.ex03;

public class PilhaFila {
    
    // geral
    private Integer[] items;

    // stack
    private int top;

    // queue
    private int lastItem;

    // constructors
    public PilhaFila(int length) {
        items = new Integer[length];
        top = -1;
        lastItem = length;
    }
    public PilhaFila() {
        this(10);
    }
    
    // is empty
    public boolean isEmpty(int vector) {
        switch (vector) {
            case 1:
                return top == -1;
            case 2:
                return lastItem == items.length;        
            default:
                throw new IllegalArgumentException("vector " + vector + " is out of range");
        }
    }

    // is not empty
    public boolean isNotEmpty(int vector) {
        return !isEmpty(vector);
    }   

    // is full
    public boolean isFull() {
        return top == (lastItem - 1);
    }

    // is not full
    public boolean isNotFull() {
        return !isFull();
    }

    // displayAll
    public void displayAll() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + ", ");
        }
        System.out.println();
    }

    // push
    public void push(int value) {
        if (isNotFull()) {
            items[++top] = value;
            return;
        }

        throw new IllegalStateException("the structure are full");
    }

    // pop
    public Integer pop() {
        if(isNotEmpty(1)) {
            Integer value = items[top];
            items[top--] = null;
            return value;
        }

        throw new IllegalStateException("the stack is empty");
    }

    // insert
    public void insert(int value) {
        if(isNotFull()) {
            items[--lastItem] = value;
        }
    }

    // move all queue values to left
    private void moveQueueValuesToRight() {
        if (isNotFull()) {
            for(int i = lastItem; i < items.length; i++) {
                items[i - 1] = items[i];
            }
            return;
        }

        throw new IllegalStateException("the structure is full");
    }

    // poll
    public  Integer poll() {
        if (isNotEmpty(2)) {
            Integer value = items[lastItem];
            items[lastItem] = null;
            return value;
        }

        throw new IllegalStateException("the structure is empty");
    }
}
