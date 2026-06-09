 public class MaxOfSubArray {
    public static void MaxOfSubArray(int numbers[]) {
        int currentSum;
        int maxSum = Integer.MIN_VALUE;

        for (int i =0; i <numbers.length; i++){
            for(int j =i ; j< numbers.length; j++){
                currentSum=0;
                //print the subarray sum
                for(int k =i; k <=j; k++ ){
                    currentSum += numbers[k];

                }
                System.out.println("the current sum = " + currentSum );

                if(maxSum <= currentSum){
                     maxSum = currentSum;
                }
               
            }
        }
        System.out.println("maximum sum = " + maxSum);
    }
    public static void main(String[] args) {
        int numbers [] ={ 1,-2,3,4,5,6};
        MaxOfSubArray(numbers);
    }
    
} 
