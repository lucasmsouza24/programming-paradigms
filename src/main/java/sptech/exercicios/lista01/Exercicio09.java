package sptech.exercicios.lista01;

public class Exercicio09 {
    
    public static void main(String[] args) {
        
        int value1 = 9;
        int value2 = 12;
        int value3 = 32;

        System.out.println("(recursive) " + value1 + " = " + recursiveBinary(value1));
        System.out.println("(imperative) " + value1 + " = " + imperativeBinary(value1));
        System.out.println("(recursive) " + value2 + " = " + recursiveBinary(value2));
        System.out.println("(imperative) " + value2 + " = " + imperativeBinary(value2));
        System.out.println("(recursive) " + value3 + " = " + recursiveBinary(value3));
        System.out.println("(imperative) " + value3 + " = " + imperativeBinary(value3));
    }

    private static String recursiveBinary(int value) {
        if (value / 2 != 0) {
            return String.valueOf(recursiveBinary(value / 2)) + value % 2;
        }
        return String.valueOf(value);
    }

    public static String imperativeBinary(int value) {
        String bin = "";

        while (value / 2 != 0) {
            bin = (value % 2) + bin;
            value /= 2;
        }

        return (value % 2) + bin;
    }
}
