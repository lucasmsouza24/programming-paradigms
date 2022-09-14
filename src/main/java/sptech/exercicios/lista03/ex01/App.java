package sptech.exercicios.lista03.ex01;

public class App {
    
    public static void main(String[] args) {
        SortedLinkedList linked = new SortedLinkedList();

        linked.insert(20);
        linked.insert(10);
        linked.insert(7);
        linked.insert(3);
        linked.insert(1);
        linked.insert(2);

        linked.display();

        System.out.println(linked.search(7).getInfo());
    }
}
