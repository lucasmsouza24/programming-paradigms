package sptech.exercicios.exercicios01.ex01;

public class Exercicio01 {
    
    public static void main(String[] args) {

        // recursive way
        System.out.println(sum(4));

        // imperative way
        
    }

    public static int sum(int n) {
        if(n >= 0) {
            return n + sum(n - 1);
        }
        return 0;
    }
}
