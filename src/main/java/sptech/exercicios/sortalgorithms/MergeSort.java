package sptech.exercicios.sortalgorithms;

public class MergeSort {
    
    public static int[] sort(int[] unsorted) {
        int[] sorted = unsorted.clone();

        sorted = sort(0, sorted.length, sorted);

        return sorted;
    }

    public static int[] sort(int p, int r, int[] v) {
        if(p < r - 1) {
            int q = (p + r) / 2;
            sort(p, q, v);
            sort(q, r, v);
            intercala(p, q, r, v);
        }

        return v;
    }

    public static void intercala(int p, int q, int r, int[] v) {
        int i = p;
        int j = q;
        int k = 0;
        int[] w = new int[r-p];

        while((i < q) && (j < r)) w[k++] = v[i] <= v[j] ? v[i++] : v[j++];
        while(i < q) w[k++] = v[i++];
        while(j < r) w[k++] = v[j++];
        for(i = p; i <= r-1; i++) v[i] = w[i - p];
        
    }

}
