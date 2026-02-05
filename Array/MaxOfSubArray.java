public class MaxOfSubArray {

    public static void maxsubarray (int numbers[]){
        int currsum=0;
        int maxsubarray =  Integer.MIN_VALUE;
        for(int i =0 ; i < numbers.length; i++){
            int start = i;
            for(int j =i ; j<numbers.length;j++){
                int end = j;
                 currsum = 0;
                for(int k = start; k<=end;k++){
                    //subarray sum
                    currsum+= numbers[k];
                   

                }
                System.out.println(currsum);
                if(maxsubarray < currsum){
                    maxsubarray = currsum;
                }
                
            }
            
        }
    
        System.out.println("max sum = " + maxsubarray);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        maxsubarray(numbers);
    }
}
    

