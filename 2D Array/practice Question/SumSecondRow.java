//Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18

public class SumSecondRow {
    public static int sumRow(int nums[][]){
        int sum =0 ;
        // traverse the second row
        for(int j =0 ; j<nums[1].length; j++){
            sum +=nums[1][j];
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[][]={
             {1, 4, 9},
                {11, 4, 3},
                {2, 2, 3}
        };
        int result = sumRow(nums);
        System.out.println("sum = " + result);
    }
}
