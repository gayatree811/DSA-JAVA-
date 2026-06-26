/*  given a numbers in array , prints the -ve numbers only  */


public class Qone {
    public static void main(String[] args) {
        int[] arr =  {0,-4,8,-3,-23,736,265,-3};

        for (int i = 0; i < arr.length; i ++ ){
            if(arr[i] < 0 ){
                System.out.println(arr[i] + " ");
            }
        }
        }
    }
