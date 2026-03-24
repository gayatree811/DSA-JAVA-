public class rowWithMaxSum {
    public static void main(String[] args) {
        int arr [][] = {{1,2,3,},{2,3,4,},{3,8,5}};
        int maxsum = Integer.MIN_VALUE;
         int row=-1;
        for(int i =0 ; i<arr.length; i++){
             int sum =0 ;
            for(int j =0 ; j<arr[0].length; j++){
               
                sum +=arr[i][j];
            }
            // this is for only maxsum
            //maxsum = Math.max(maxsum, sum);
            if(sum > maxsum){
                maxsum = sum;
                row =i;
            }
        }
        System.out.println(" the row number is "+ row + " " +"and maxsum is "+ maxsum);
    } 
}
