package sptech.aulas.aula04;

public class App {
    
    public static void main(String[] args) {
        int[] heap = {16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4};
        int[] sorted = Sort.heapSort(heap);  
        display(heap);
        display(sorted);
    }

    public static void display(int[] array) {
        System.out.println(arrayToString(array));
    }
    
    public static String arrayToString(int[] array) {
        String str = "";
        for(int i = 0; i < array.length; i++) {
            str += array[i] + ", ";
        }
        return str;
    }

}
