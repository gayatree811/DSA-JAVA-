// this is the approach 1 , and this will fail the case where all the elements will be -ve, need atleast one non-negative value

public class KadanesAlgorithm {
    public static void main(String[] args) {
        
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
         
        int ms = Integer.MIN_VALUE;
        int cs =0;

        for(int i =0; i<numbers.length; i++){
            cs += numbers[i];
            if (cs < 0 ){
                cs =0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("max sum is " + ms);

    }
}
