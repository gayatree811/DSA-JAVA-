package Recursion;

public class LastOccurance {
    static int LastOcc(int arr[], int key, int i ){
        if(i == arr.length){
            return -1;
        }
        int ans = LastOcc(arr, key, i +1);

        if (ans != -1 ){
            return ans;
        }
        if(arr[i] == key){
            return i ;
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int arr[] = {1,2 ,3,4,5,4,4};
        int key = 3 ;

        int result = LastOcc(arr, key , 0);
        System.out.println("last occurance = " + result);
    }
}
