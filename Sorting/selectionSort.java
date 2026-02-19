public class selectionSort {
    public static void main(String[] args) {
            int arr[]= { 5,3,8,4,2};
            int n = arr.length;

            for(int i = 0 ; i <n-1 ; i++ ){
                int minIndex = i; // means the current index is the min indedx

                for(int j = i + 1 ; j <n ; j++){
                    if (arr[j]<arr[minIndex]){
                        minIndex= j;
                    }
                }

                // now swap
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            // print the sorted array
            for (int i = 0 ; i<n; i++){
                System.out.print(arr[i] + " ");
            }
    }
}
