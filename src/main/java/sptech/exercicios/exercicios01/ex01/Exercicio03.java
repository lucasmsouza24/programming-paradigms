package sptech.exercicios.exercicios01.ex01;

public class Exercicio03 {
    
    public static void main(String[] args) {
        int[] array = {7, 3, 5, 2};

        System.out.println(recursiveEvenSum(array));
        System.out.println(imperativeEvenSum(array));
    }

    public static int recursiveEvenSum(int[] array, int start) {
        if (start < array.length) {
            return array[start] % 2 == 0 ? recursiveEvenSum(array, start + 1) : (array[start] + recursiveEvenSum(array, start + 1));
        }
        return 0;
    }
    public static int recursiveEvenSum(int[] array) {
        return recursiveEvenSum(array, 0);
    }

    public static int imperativeEvenSum(int[] array) {
        int sum = 0;
        for(int value : array) {
            if (value % 2 == 0) {
                sum += value;
            }
        }
        return sum;
    }
}
