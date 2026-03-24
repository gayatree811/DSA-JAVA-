import java.util.*;
public class createarray {
    static int[][] intarray(int rows , int cols){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[rows][cols];


        System.out.println("enter the element");
        for(int i = 0; i<rows; i++){
            for(int j =0 ; j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    static void printarr(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = intarray(2, 4);
        printarr(arr);
    }
    
}
