package sptech.aulas.aula02;

public class App {
    
    public static void main(String[] args) {
        
        LinkedList linked = new LinkedList();

        // inserts
        linked.insert(1);
        linked.insert(2);
        linked.insert(3); 

        System.out.println(linked.getSize());

        linked.display();

        System.out.println(linked.search(2).getInfo());

        linked.remove(2);
        linked.display();
    }
}
