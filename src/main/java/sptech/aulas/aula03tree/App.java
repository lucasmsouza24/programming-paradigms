package sptech.aulas.aula03tree;

public class App {
    
    public static void main(String[] args) {
        
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.createRoot(10);
        tree.insertLeftNode(tree.getRoot(), 5);
        tree.insertRightNode(tree.getRoot(), 20);

        tree.displayBeforeOrder();
        tree.displayInOrder();
        tree.displayAfterOrder();
    }

}
