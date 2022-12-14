package sptech.aulas.aula04;

public class Sort {

    public static int[] heapSort(int[] heap) {
        int[] v = heap.clone();
        int n = v.length - 1;
        
        for(int m = 0; m < n; m++) {
            System.out.println(m);
            insertInHeap(m, v);
            // System.out.println("[1st] " + App.arrayToString(v) + " [m]: " + m);
        }
        
        for(int m = n; m > 0; m--) {
            // System.out.println("[2nd] m: " + m);
            trade(v, 0, m);
            adjustHeap(m - 1, v);
        }

        return v;
    };

    private static void insertInHeap(int m, int[] v) {
        int f = m + 1;
        int p = getFather(f);
        while(f > 0 && v[p] < v[f]) {
            trade(v, p, f);
            f = p;
            p = getFather(f);
        }
    };

    private static void adjustHeap(int m, int[] v) {
        int f = 1;
        while(f <= m) {
            if(f < m && v[f] < v [f+1]) {
                f = f + 1;
            }

            int p = getFather(f);
            if(v[p] >= v[f]) {
                break;
            }

            trade(v, p, f);
            f = f * 2 + 1;
        }
    };

    private static int getFather(int index) {
        return index % 2 == 1 ? (index - 1) / 2 : (index - 2) / 2;
    }

    private static void trade(int[] vector, int i1, int i2) {
        // System.out.println("i1: " + i1 + ", i2: " + i2);
        int aux = vector[i1];
        vector[i1] = vector[i2];
        vector[i2] = aux;
    };

}
