package sptech.exercicios.lista01;

public class Exercicio08 {
    
    public static void main(String[] args) {
        
        int value1 = 132;
        int value2 = 3417;

        System.out.println("(recursive) soma: " + recursiveSum(value1));
        System.out.println("(imperative) soma: " + imperativeSum(value1));
        System.out.println("(recursive) soma: " + recursiveSum(value2));
        System.out.println("(imperative) soma: " + imperativeSum(value2));
        
    }

    private static int imperativeSum(int value) {

        int sum = 0;

        while (value % 10 != 0) {
            sum += value % 10;
            value /= 10;
        }

        return sum;
    }

    private static int recursiveSum(int value) {
        if(value % 10 != 0) {
            return((value % 10) + recursiveSum((value / 10)));
        }

        return value;
    }
}
