public class output {
    public static void main(String[] args) {
       // int arr [][] = new int[3][4];

       // we can directly create the array
       int [][] arr= {{1,2,3,4}, {3,2,5,7},{5,3,8,3},{3,5,7,0}};

        // for find number of rows and cols
        System.out.println("number of rows = " + arr.length + " " + " number of cols = " + arr[0].length);
        for(int i = 0 ; i <arr.length ; i++){
            for (int j=0; j<arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
