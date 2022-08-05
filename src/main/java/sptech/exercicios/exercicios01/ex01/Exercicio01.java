package sptech.exercicios.exercicios01.ex01;

public class Exercicio01 {
    
    public static void main(String[] args) {
        int value = 5;

        // recursive way
        System.out.println(recursiveSum(value));

        // imperative way
        System.out.println(sum(value));
    }

    // recursive
    public static int recursiveSum(int n) {
        if(n >= 0) {
            return n + recursiveSum(n - 1);
        }
        return 0;
    }

    // imperative
    public static int sum(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n--;
        }
        return sum;
    }
}
