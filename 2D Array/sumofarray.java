public class sumofarray {
    public static void main(String[] args) {
        int arr[][]={{1,2},{2,3},{3,5}};

      /*   for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        } */
        int sum=0;
        for(int i =0 ; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                sum +=arr[i][j];
            }
        }
        System.out.println(sum);

    }
}
