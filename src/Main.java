//import math.AreaOfTriangle;

import applet.HelloWorldApplet;
import search.BinarySearch;
import search.Fibonacci;
import search.InterpolationSearch;
import sort.MergeSort;
import threading.ThreadVersion;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        interpolationSort();
    }

    private static void startMultiThread()
    {
        ThreadVersion T1 = new ThreadVersion( "Thread-1");
        T1.start();

        ThreadVersion T2 = new ThreadVersion( "Thread-2");
        T2.start();
    }


    private static void fibbonaciSearch() {
        int arr[] = {10, 22, 35, 40, 45, 50,
                80, 82, 85, 90, 100};
        int n = 11;
        int x = 85;

        System.out.print ("Found at index: "+
                (new Fibonacci()).search(arr, x, n));
    }

    private static void interpolationSort()
    {
        int[] array = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23,
                24, 33, 35, 42, 47};

        int index = (new InterpolationSearch()).search(array,24);

        // If element was found
        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
    }

    private static void binarySearch()
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.search(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    private static void runArraySort () throws IOException
    {
        System.out.println(System.getProperty("java.version"));
        int[] arrayToSort = (new InputArray()).input();
        printArray(arrayToSort);

        int[] result = (new MergeSort()).Sort(arrayToSort,0, arrayToSort.length - 1);

        System.out.println();
        printArray(result);
    }


    private static void printArray(int[] array) {
        Arrays.stream(array).mapToObj(j -> j + "  ").forEach(System.out::print);
    }
}
