//import math.AreaOfTriangle;

import sort.MergeSort;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arrayToSort = (new InputArray()).input();
        printArray(arrayToSort);

        int[] result = (new MergeSort()).Sort(arrayToSort,0, arrayToSort.length - 1);

        System.out.println();
        printArray(result);
    }

    public static void printArray(int[] array) {
        Arrays.stream(array).mapToObj(j -> j + "  ").forEach(System.out::print);
    }
}
