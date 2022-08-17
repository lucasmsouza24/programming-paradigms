package sptech.exercicios.sortalgorithms;

public class App {
    
    public static void main(String[] args) {
        
        int[] unsorted = {5, 3, 1, 6, 3, 4, 2, 7, 1, 1};
        int[] insert = InsertSort.sort(unsorted);
        int[] merge = MergeSort.sort(unsorted);
        int[] quick = QuickSort.sort(unsorted);

        displayValues(unsorted, "Unsorted");
        displayValues(insert, "Insert");
        displayValues(merge, "Merge");
        displayValues(quick, "Quick");
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
