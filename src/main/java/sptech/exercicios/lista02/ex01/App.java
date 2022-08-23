package sptech.exercicios.lista02.ex01;

import sptech.exercicios.sortalgorithms.QuickSort;

public class App {
    
    public static void main(String[] args) {
        DuasPilhas<Integer> valoresDesordenados = new DuasPilhas<Integer>(10);
        valoresDesordenados.push(-13, 1);
        valoresDesordenados.push(11, 1);
        valoresDesordenados.push(-9, 1);
        valoresDesordenados.push(6, 1);
        valoresDesordenados.push(-5, 1);
        valoresDesordenados.push(2, 2);
        valoresDesordenados.push(-1, 2);
        valoresDesordenados.push(8, 2);
        valoresDesordenados.push(-7, 2);
        valoresDesordenados.push(3, 2);

        valoresDesordenados.displayAll();

        DuasPilhas<Integer> valoresOrdenados = sortValues(valoresDesordenados);
        // valoresOrdenados.pop(2);
        valoresOrdenados.displayAll();
        exibeOrdemInversa(valoresOrdenados);
    }

    public static DuasPilhas<Integer> sortValues(DuasPilhas<Integer> unsorted) {
        int[] sorted = new int[unsorted.size()];
        sorted = QuickSort.sort(sorted);
        DuasPilhas<Integer> stack = new DuasPilhas<Integer>(unsorted.size());

        int i = 0;

        while(unsorted.isNotEmpty(1)) {
            sorted[i++] = unsorted.pop(1);
        }
        while(unsorted.isNotEmpty(2)) {
            sorted[i++] = unsorted.pop(2);
        }
        
        for (int value : sorted) {
            if (value < 0) {
                stack.push(value, 1);
            } else {
                stack.push(value, 2);
            }
        }

        return stack;
    }

    public static void exibeOrdemInversa(DuasPilhas<Integer> stack) {
        while(stack.isNotEmpty(1)) {
            System.out.print(stack.pop(1) + ", ");
        }

        DuasPilhas<Integer> stack2 = new DuasPilhas<Integer>();

        while(stack.isNotEmpty(2)) {
            stack2.push(stack.pop(2), 2);
        }

        while(stack2.isNotEmpty(2)) {
            System.out.print(stack2.pop(2) + ", ");
        }
    }

}
