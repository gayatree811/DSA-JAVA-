package Recursion;

public class FirstOccurance {
 public static int firstocc(int arr[], int key , int i ){
    if ( i == arr.length){
        return -1;
    }
    if ( arr[i] == key){
        return i ;
    }
    return firstocc(arr, key, i+1);
 }   
 public static void main(String[] args) {
    int arr[] = { 8,3,2,4,6,9,2,1};
    System.out.println(firstocc(arr, 2, 0));
 }
}
