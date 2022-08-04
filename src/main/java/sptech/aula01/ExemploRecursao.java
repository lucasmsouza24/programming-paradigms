package sptech.aula01;

public class ExemploRecursao {
    
    public static void main(String[] args) {

        // for
        // contagemRegressiva(5);

        // recursive
        // contagemRegressivaRecursiva(5);
        
        // fatorial
        // System.out.println(fatorial(4));

        // displaying vector
        int[] vector = {1, 2, 3, 4, 5};
        displayVector(vector, 0);
        // displayReverseVector(vector, 4);
    }

    // procedural way
    public static void contagemRegressiva(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    // recursive way
    public static void contagemRegressivaRecursiva(int n) {
        if (n >= 0) {
            System.out.println(n);
            contagemRegressivaRecursiva(n - 1);
        }
    }

    public static int fatorial(int n) {
        if (n != 0) {
            return n * (fatorial(n - 1));
        }
        return 1;
    }

    public static void displayVector(int[] vector, int index) {
        if (index < vector.length) {
            System.out.println(vector[index]);
            displayVector(vector, index + 1);
        }
    }
    public static void displayVector(int[] vector) {
        displayVector(vector, 0);
    }

    public static void displayReverseVector(int[] vector, int index) {
        if (index >= 0) {
            System.out.println(vector[index]);
            displayReverseVector(vector, index - 1);
        }
    }
}
