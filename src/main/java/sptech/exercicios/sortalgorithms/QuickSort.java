package sptech.exercicios.sortalgorithms;

public class QuickSort {

    public static int[] sort(int[] unsorted) {
        int[] array = unsorted.clone();
        partition(array, 0, array.length - 1);
        return array;
    }
    
    public static void partition(int[] v, int indInicio, int indFim) {
        
        int i = indInicio;
        int j = indFim;
        int pivo = v[(indInicio + indFim) / 2];

        while(i <= j) {
            while((i < indFim) && (v[i] < pivo)) i = i + 1;
            while((j > indInicio) && (v[j] > pivo)) j = j - 1;

            if (i <= j) {
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                i = i + 1;
                j = j - 1;
            }
        }

        if (indInicio < j) partition(v, indInicio, j);
        if (i < indFim) partition(v, i, indFim);
    }
}
