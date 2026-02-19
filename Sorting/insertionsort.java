public class insertionsort {

    public static void insertionsort(int arr[]){
        int n = arr.length;

        for (int i= 1 ; i < n ; i++){
            int current = arr[i];
            int j = i-1;


            while(j>=0 && arr[j] > current ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1 ] = current;
        }

    }
    public static void main(String[] args) {
        int arr[] = { 8,3,4,2,7,9};
        insertionsort(arr);
        System.out.println("sorted array");
        for(int i = 0 ; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
