package sptech.exercicios.lista02.ex01;

public class App {
    
    public static void main(String[] args) {
        DuasPilhas<Integer> stack = new DuasPilhas<Integer>();
        stack.push(-1, 1);
        stack.push(-2, 1);
        stack.push(-3, 1);
        stack.push(1, 2);
        stack.push(2, 2);
        stack.push(3, 2);
        stack.push(3, 2);
        stack.push(3, 2);
        System.out.println(stack.isFull());
        // stack.push(3, 2);

        stack.displayAll();
    }

}
