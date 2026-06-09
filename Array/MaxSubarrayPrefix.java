/* public class MaxSubarrayPrefix {

    public static void main(String[] args) {

        int[] arr = {1, -2, 6, -1, 3};
        int n = arr.length;

        // Step 1: Create prefix sum array
        int[] prefix = new int[n];

        prefix[0] = arr[0];
// calculate the prefix arr
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // Step 2: Check all subarrays
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int currentSum;

                if (i == 0) {
                    currentSum = prefix[j];
                } else {
                    currentSum = prefix[j] - prefix[i - 1];
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
} */


public class MaxSubarrayPrefix{
    public static void main(String[] args) {
        int [] arr = {0,1,2,3};
        int n = arr.length;

        int prefix[] = new int[n];

        // create the prefix sum arry
        for (int i =1 ; i < n ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int maxSum = Integer.MIN_VALUE;


        // check all possible subarray
        for (int i =0 ; i <n ; i++){
            for (int j = i ; j < n ; j++){

                int currentSum;

                if (i == 0){
                    currentSum = prefix[j];
                }else {
                    currentSum = prefix[j] - prefix[i -1]; 
                }

                if (currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("maximum sum is =  " + maxSum);
    }
}