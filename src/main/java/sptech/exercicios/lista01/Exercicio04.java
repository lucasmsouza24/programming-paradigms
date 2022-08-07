package sptech.exercicios.lista01;

public class Exercicio04 {
    
    public static void main(String[] args) {

        // objective: return amount of odd values in integer array
        int[] values = {7, 3, 5, 2};

        System.out.println(imperativeAmountOfOdds(values));
        System.out.println(recursiveAmountOfOdds(values));
    }

    // imperative
    public static int imperativeAmountOfOdds(int[] array) {
        int amount = 0;
        for (int value : array) {
            if (value % 2 == 1) {
                amount++;
            }
        }
        return amount;
    }

    // recursive
    public static int recursiveAmountOfOdds(int[] array, int start) {
        if (start < array.length) {
            return array[start] % 2 == 1 ? 1 + recursiveAmountOfOdds(array, start + 1) : recursiveAmountOfOdds(array, start + 1);
        }
        return 0;
    }
    public static int recursiveAmountOfOdds(int[] array) {
        return recursiveAmountOfOdds(array, 0);
    }

}
