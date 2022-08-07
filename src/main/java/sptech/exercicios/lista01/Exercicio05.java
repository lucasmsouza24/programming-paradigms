package sptech.exercicios.lista01;

public class Exercicio05 {
    
    public static void main(String[] args) {

        int[] array = {7, 3, 5, 3};
        int x = 3;

        System.out.println(imperativeCountValue(array, x));
        System.out.println(recursiveCountValue(array, x));
    }

    // imperative
    public static int imperativeCountValue(int[] array, int x) {
        int count = 0;
        for(int value : array) {
            if (value == x) {
                count++;
            }
        }
        return count;
    } 

    // recursive
    public static int recursiveCountValue(int[] array, int x, int start) {
        if(start < array.length) {
            return array[start] == x ? 1 + recursiveCountValue(array, x, start + 1) : recursiveCountValue(array, x, start + 1);
        }
        return 0;
    }
    public static int recursiveCountValue(int[] array, int x) {
        return recursiveCountValue(array, x, 0);
    }

}
