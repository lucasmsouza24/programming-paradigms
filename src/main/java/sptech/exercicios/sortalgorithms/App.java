package sptech.exercicios.sortalgorithms;

public class App {
    
    public static void main(String[] args) {
        
        int[] unsorted = {5, 2, 2, 2, 1, 3, 4, 2, 7, 7};
        int[] insert = InsertSort.sort(unsorted);
        int[] merge = MergeSort.sort(unsorted);
        int[] quick = QuickSort.sort(unsorted);

        displayValues(unsorted, "Unsorted");
        displayValues(insert, "Insert");
        displayValues(merge, "Merge");
        displayValues(quick, "Quick");

        // binary search (in quick sorted)
        int value = 7;
        int index = BinarySearch.search(quick, value);
        int recursiveIndex = BinarySearch.recursiveSearch(quick, value);
        System.out.println(String.format("value: %d, index: %d", value, index));
        System.out.println(String.format("value: %d, index: %d", value, index));
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
