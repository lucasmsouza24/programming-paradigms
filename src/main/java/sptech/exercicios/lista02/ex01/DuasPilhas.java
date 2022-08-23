package sptech.exercicios.lista02.ex01;

public class DuasPilhas<T> {

    private T[] stack;
    private int top1;
    private int top2;

    public DuasPilhas(int length) {
        stack = (T[]) new Object[length];
        top1 = -1;
        top2 = length;
    }
    public DuasPilhas() {
        this(10);
    }

    public void push(T value, int vector) {
        switch (vector) {
            case 1:
                push1(value);
                break;
            case 2:
                push2(value);
                break;
            default:
                break;
        }
    }

    // methods
    public boolean isFull() {
        return top1 == top2 - 1;
    }

    public int size() {
        return stack.length;
    }

    private void push1(T value) {
        if (this.isFull()) throw new IllegalStateException("the Stacks are full");
        stack[++top1] = value;
    }    
    
    private void push2(T value) {
        if (this.isFull()) throw new IllegalStateException("the Stacks are full");
        stack[--top2] = value;
    }

    public void displayArray1() {
        for (int i = 0; i < top1 + 1; i++) {
            System.out.print(stack[i] + ", ");
        }
    }

    public T[] arrayOf2() {
        return null;
    }

    public void displayAll() {
        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + ", ");
        }
        System.out.println("");
    }

    public T pop(int vector) {
        T value;
        switch (vector) {
            case 1:
                value = peek(vector);
                stack[top1--] = null;
                return value;
            case 2:
                value = peek(vector);
                stack[top2++] = null;
                return value;
            default:
                throw new IllegalArgumentException("vector " + vector + " is out of range");
        }
    }

    public T peek(int vector) {
        if(this.isEmpty(vector)) throw new IllegalStateException("the stack is empty");

        switch (vector) {
            case 1:                
                return stack[top1];
            case 2:
                return stack[top2];
            default:
                throw new IllegalArgumentException("vector " + vector + " is out of range");
        }
    }

    public boolean isEmpty(int vector) {
        switch (vector) {
            case 1:
                return top1 == -1;
            case 2:
                return top2 == stack.length;
            default:
                throw new IllegalArgumentException("Vector " + vector + " does not exist");
        }
    }

    public boolean isNotEmpty(int vector) {
        return !isEmpty(vector);
    }
}
