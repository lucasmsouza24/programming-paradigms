package sptech.exercicios.lista04.ex01;

public class App {
    
    public static void main(String[] args) {
        
        LinkedStack linkedStack = new LinkedStack();

        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        linkedStack.push(4);
        linkedStack.push(5);

        System.out.println("\nfirst sout\n");
        linkedStack.displayValues();

        System.out.println("\nsecond sout\n");
        System.out.println(linkedStack.pop().getInfo());
        linkedStack.displayValues();
    }

}
