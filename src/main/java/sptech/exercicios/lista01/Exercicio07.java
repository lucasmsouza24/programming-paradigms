package sptech.exercicios.lista01;

public class Exercicio07 {
    
    public static void main(String[] args) {

        Integer[] array = {1, 3, 2, 8, 5, 4, 3, 7, 3, 2, 5, 10};

        System.out.println(imperativeMaxValue(array));
        System.out.println(recursiveMaxValue(array));
    }

    public static Integer imperativeMaxValue(Integer[] array) {
        Integer max = Integer.MIN_VALUE;

        for(Integer value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    
    public static int recursiveMaxValue(Integer[] array, Integer start) {
        if (start < array.length - 1) {
            if (array[start] > recursiveMaxValue(array, start + 1)) {
                return array[start];
            } else {
                return recursiveMaxValue(array, start + 1);
            }
        }
        return array[start];
    }
    public static int recursiveMaxValue(Integer[] array) {
        return recursiveMaxValue(array, 0);
    }

    // public static int recursiveMaxValue(Integer[] array, Integer start, Integer max) {
    //     if (start < array.length) {
    //         if (array[start] > max) {
    //             return recursiveMaxValue(array, start + 1, array[start]);
    //         } 
    //         return recursiveMaxValue(array, start + 1, max);
    //     }
    //     return max;
    // }
    // public static int recursiveMaxValue(Integer[] array) {
    //     return recursiveMaxValue(array, 0, Integer.MIN_VALUE);
    // }
}
