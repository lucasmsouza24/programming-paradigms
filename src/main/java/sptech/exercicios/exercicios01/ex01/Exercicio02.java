package sptech.exercicios.exercicios01.ex01;

public class Exercicio02 {
    
    public static void main(String[] args) {

        int[] array = {7, 3, 5, 2};

        System.out.println(imperativeSum(array));
        System.out.println(recursiveSum(array));
    }

    // imperative
    public static int imperativeSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // recursive
    public static int recursiveSum(int[] array, int start) {
        if (start < array.length) {
            return array[start] + recursiveSum(array, start + 1);
        }
        return 0;
    }
    public static int recursiveSum(int[] array) {
        return recursiveSum(array, 0);
    }

}
