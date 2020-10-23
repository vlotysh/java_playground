package search;

public class BinarySearch {
    public int search(int arr[], int left, int right, int find) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == find)
                return mid;

            if (arr[mid] > find)
                return search(arr, left, mid - 1, find);

            return search(arr, mid + 1, right, find);
        }

        return -1;
    };
}
