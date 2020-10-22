package sort;

public class MergeSort {
    private int[] merge(int[] array, int length, int middle, int height) {
        int i, j, c = length;
        int[] b = new int[height + 1];

        for (i = length, j = middle + 1; i <= middle && j <= height; c++) {
            if (array[i] <= array[j])
                b[c] = array[i++];
            else
                b[c] = array[j++];
        }

        while (i <= middle)
            b[c++] = array[i++];

        while (j <= height)
            b[c++] = array[j++];

        for (i = length; i <= height; i++)
            array[i] = b[i];

        return array;
    }

    public int[] Sort(int[] array, int length, int height) {
        if (length < height) {
            int middle = (length + height) / 2;
            Sort(array, length, middle);
            Sort(array, middle + 1, height);
            return merge(array, length, middle, height);
        }

        return array;
    }
}
