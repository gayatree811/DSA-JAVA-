public class MergeSort {

    static void MergeSort(int arr[], int si, int ei) {

        // Base case
        if (si >= ei) {
            return;
        }

        // Find middle
        int mid = (si + ei) / 2;

        // Sort left half
        MergeSort(arr, si, mid);

        // Sort right half
        MergeSort(arr, mid + 1, ei);

        // Merge both halves
        merge(arr, si, mid, ei);
    }

    static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        // Compare elements
        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Copy remaining left elements
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining right elements
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp to original array
        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }

    public static void main(String[] args) {

        int arr[] = {6, 2, 20, 1, 23, 5, 21, 7};

        MergeSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}