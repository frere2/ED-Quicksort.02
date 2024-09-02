package view;

import br.edu.fateczl.thiago.quicksort.QuickSort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] vetor = new int[] {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
        int[] vetor1 = new int[] {44, 43, 42, 41, 40, 39, 38};
        int[] vetor2 = new int[] {31, 32, 33, 34, 99, 98, 97, 96};

        QuickSort quickSort = new QuickSort();

        System.out.println(Arrays.toString(quickSort.sort(vetor, 0, vetor.length - 1)));
        System.out.println(Arrays.toString(quickSort.sort(vetor1, 0, vetor1.length - 1)));
        System.out.println(Arrays.toString(quickSort.sort(vetor2, 0, vetor2.length - 1)));
    }
}
