package sptech.exercicios.sortalgorithms;

public class InsertSort {
    
    public static int[] sort(int[] tempArray) {

        int min;
        int[] array = tempArray.clone();

        for (int i = 0; i < array.length - 2; i++) {
            min = i;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[j] < array[min]) {
                    min = j;

                    // troca de valores
                    int aux = array[i];
                    array[i] = array[min];
                    array[min] = aux;
                }
            }
        }

        return array;
    }
}
