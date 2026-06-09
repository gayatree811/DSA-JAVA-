public class MaxMinInSubArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {

            for(int j = i; j < arr.length; j++) {

                int sum = 0;

                for(int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                System.out.println("sum = " + sum);

                if(sum < minSum) {
                    minSum = sum;
                }

                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Minimum Sum = " + minSum);
    }
}