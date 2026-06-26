public class KadanesAlgorithms {
    public static void main(String[] args) {
        int [] numbers = {2, -3, 4, -1, 2};

        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < numbers.length; i++){
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("maximum sum is = " + maxSum);
    }
    
}
