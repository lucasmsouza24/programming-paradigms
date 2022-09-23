package sptech.exercicios.lista04.ex02;

public class App {
    
    public static void main(String[] args) {
        
        LinkedQueue linkedQueue = new LinkedQueue();

        // isEmpty
        title("isEmpty");
        System.out.println("isEmpty: " + linkedQueue.isEmpty());
        
        // insert
        title("insert");
        linkedQueue.insert(10);
        linkedQueue.insert(20);
        linkedQueue.insert(30);
        linkedQueue.insert(40);
        
        linkedQueue.display();
        System.out.println("isEmpty: " + linkedQueue.isEmpty());

        // peek
        title("peek");
        System.out.println("peek: " + linkedQueue.peek().getInfo());

        // poll
        title("poll");
        linkedQueue.display();
        System.out.println("poll: " + linkedQueue.poll().getInfo());
        linkedQueue.display();

        
    }

    public static void title(String txt) {
        System.out.println("\n" + "=".repeat(30));
        System.out.println(txt.toUpperCase());
        System.out.println("=".repeat(30));
    }

}
