package sptech.exercicios.lista03.ex02;

import sptech.exercicios.lista03.LinkedList;

public class App {
    
    public static void main(String[] args) {
        
        // concat
        title("concat");
        LinkedList linked = new LinkedList();
        LinkedList linked2 = new LinkedList();

        linked.insert(3);
        linked.insert(2);
        linked.insert(1);
        
        linked2.insert(3);
        linked2.insert(2);
        linked2.insert(1);

        linked.display();
        linked2.display();

        // linked.concat(linked2);

        linked.display();

        // compara
        title("compara");

        LinkedList linked3 = new LinkedList();
        LinkedList linked4 = new LinkedList();
        LinkedList linked5 = new LinkedList();
        LinkedList linked6 = new LinkedList();

        // linked 3
        linked3.insert(3);
        linked3.insert(2);
        linked3.insert(1);
        
        // linked 4
        linked4.insert(3);
        linked4.insert(2);
        linked4.insert(1);

        // linked 5
        linked5.insert(3);
        linked5.insert(2);
        linked5.insert(1);
        
        // linked 6
        linked6.insert(3);
        linked6.insert(2);
        linked6.insert(1);


        linked3.display();
        linked4.display();
        System.out.println(linked3.equals(linked4));

        linked5.display();
        linked6.display();
        System.out.println(linked5.equals(linked6));
    }

    public static void title(String title) {
        System.out.println("=".repeat(30));
        System.out.println(title.toUpperCase());
        System.out.println("=".repeat(30));
    }

}
