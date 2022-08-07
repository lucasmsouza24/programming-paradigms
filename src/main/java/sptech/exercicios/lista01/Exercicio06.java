package sptech.exercicios.lista01;

public class Exercicio06 {
    
    public static void main(String[] args) {
        System.out.println(imperativeMdc(90, 54));
        System.out.println(recursiveMdc(90, 54));
    }

    // imperative
    public static int imperativeMdc(int value1, int value2) {
        int rest;

        while(value2 != 0) {
            rest = value1 % value2;
            value1 = value2;
            value2 = rest;
        }

        return value1;
    }

    // recursive
    public static int recursiveMdc(int value1, int value2) {
        if (value1 % value2 != 0) {
            return recursiveMdc(value2, value1 % value2);
        }
        return value2;
    }

}
