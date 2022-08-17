package sptech.exercicios.sortalgorithms;

public class BinarySearch {
    
    public static int search(int[] vetor, int x) {

        int indinf = 0;
        int indsup = vetor.length - 1;

        while(indinf <= indsup) {
            int meio = (indinf + indsup) / 2;
            
            if(vetor[meio] == x) {
                return meio;
            } else if (x < vetor[meio]) {
                indsup = meio - 1;
            } else {
                indinf = meio + 1;
            }
        }

        return -1;
    }

    private static int recursiveSearch(int[] vetor, int x, int indinf, int indsup) {

        int meio = ((indinf + indsup) / 2);

        if(indinf <= indsup) {
            if(vetor[meio] == x) {
                return meio;
            } else if (x < vetor[meio]) {
                return recursiveSearch(vetor, x, indinf, meio - 1);
            } else {
                return recursiveSearch(vetor, x, meio + 1, indsup);
            }
        }

        return -1;
    }
    public static int recursiveSearch(int[] vetor, int x) {
        return recursiveSearch(vetor, x, 0, vetor.length - 1);
    }
}
