package sptech.exercicios.sortalgorithms;

public class App {
    
    public static void main(String[] args) {
        
        int[] unsorted = {3, 2, 4, 1, 5, 2, 6};
        int[] insert = InsertSort.sort(unsorted);
        int[] merge = MergeSort.sort(unsorted);

        displayValues(unsorted, "Unsorted");
        displayValues(insert, "Insert");
        displayValues(merge, "Merge");
    }

    public static void displayValues(int[] array, String title) {
        System.out.println(title);

        for (int value : array) {
            System.out.print(value + ", ");
        }

        System.out.println();
        System.out.println();
    }
}
