package sptech.exercicios.lista02.ex02;

public class FilaPilha {
    
    // geral
    private Integer[] items;

    // queue
    private int lastItem;

    // stack
    private int top;

    // constructor
    public FilaPilha(int length) {
        items = new Integer[length];
        top = length;
        lastItem = -1;
    }
    public FilaPilha() {
        this(10);
    }

    // is empty
    public boolean isEmpty(int vector) {
        switch (vector) {
            case 1:
                return lastItem == -1;
            case 2:
                return top == items.length;
            default:
                throw new IllegalArgumentException("vector " + vector + " does not exists.");
        }
    }

    // is not empty
    public boolean isNotEmpty(int vector) {
        return !isEmpty(vector);
    }

    // is full
    public boolean isFull() {
        return lastItem == (top - 1);
    }

    // is not full
    public boolean isNotFull() {
        return !isFull();
    }

    // insert value in queue
    public void insert(int value) {
        if (isNotFull()) {
            items[++lastItem] = value;
            return;
        }

        throw new IllegalStateException("the structure is full");
    }

    // move all values (from queue) to right
    private void moveQueueValuesToLeft() {
        for (int i = 0; i <= lastItem; i++) {
            items[i] = items[i + 1];
        }
        items[lastItem--] = null;
    }

    // poll: remove value from queue
    public int poll() {
        if (isNotEmpty(1)) {
            int value = items[0];
            moveQueueValuesToLeft();
            return value;
        }

        // the queue is empty
        throw new IllegalStateException("the queue is empty");
    }

    // push value in stack
    public void push(int value) {
        if (isNotFull()) {
            items[--top] = value;
            return;
        }

        // the stack is full
        throw new IllegalStateException("the stack is full");
    }

    // pop last value in stack
    public int pop() {
        if(isNotEmpty(2)) {
            int value = items[top];
            items[top++] = null;
            return value;
        }

        // the stack is empty
        throw new IllegalStateException("the stack is empty");
    }

    // size
    public int size() {
        return items.length;
    }

    // display all values
    public void displayAll() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + ", ");
        }
        System.out.println("");
    }

    // relatory
    public void relatory() {
        System.out.println();
        System.out.println("lastItem: " + lastItem + "   top: " + top + "    isFull: " + (lastItem == (top - 1)));
        System.out.println();
    }
}
