package sptech.aulas;

public class AppHashTable {
    
    public static void main(String[] args) {
        
        HashTable hash = new HashTable(4);

        for (int i = 0; i < 10; i++) {
            hash.insert(i);
        }

        hash.display();
        hash.remove(4);
        hash.display();
    }
}
