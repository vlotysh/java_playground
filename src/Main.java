//import math.AreaOfTriangle;

import sort.MergeSort;
import threading.ThreadVersion;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        startMultiThread();
    }

    private static void startMultiThread()
    {
        ThreadVersion T1 = new ThreadVersion( "Thread-1");
        T1.start();

        ThreadVersion T2 = new ThreadVersion( "Thread-2");
        T2.start();
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
