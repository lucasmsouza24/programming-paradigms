package sptech.exercicios.lista02.ex01;

public class DuasPilhas<T> {

    private T[] stack;
    private int top1;
    private int top2;

    public DuasPilhas(int length) {
        stack = (T[]) new Object[length];
        top1 = 0;
        top2 = length - 1;
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
        System.out.println();
        return top1 == top2 - 1;
    }

    private void push1(T value) {
        if (this.isFull()) throw new IllegalStateException("the Stacks are full");
        stack[top1++] = value;
    }    
    
    private void push2(T value) {
        if (this.isFull()) throw new IllegalStateException("the Stacks are full");
        stack[top2--] = value;
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
    }
}
