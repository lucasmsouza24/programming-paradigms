package sptech.exercicios.sortalgorithms;

public class InsertSort {
    
    public static int[] sort(int[] unsorted) {

        int[] v = unsorted.clone();
        int i;
        int j;
        int x;

        for (i = 1; i <= v.length - 1; i++) {
            x = v[i];
            j = i - 1;

            while((j >= 0) && (v[j] > x)) {
                v[j + 1] = v[j];
                j = j - 1;
            }

            v[j + 1] = x;
        }

        return v;
    }
}
