public class m {

    static void selectionSort(int arr[]){
        int n = arr.length;

        for (int i =0 ; i< n-1 ; i++){
            int minIndex=i;
            for(int j = i+1; j<n; j++){
                if ( arr[j] < arr[minIndex]){
                    minIndex=j;

                }
            }
            int temp = arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2,3,8,1,0,5};
        selectionSort(arr);

        System.out.println("sorted array");
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }
    
}
