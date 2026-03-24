import java.util.*;
public class finadArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers [][] = new int [rows][cols];

        for (int i = 0; i<rows ; i++){
            for ( int j = 0 ;j<cols ; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        // to find a given number 
        int x = sc.nextInt();

        for(int i=0; i<rows ; i++){
            for(int j=0; j<cols; j++){
                if (numbers[i][j]==x){
                    System.out.println(" X is found at location (" + i + ", " + j +")");
                }
            }
        }
    }
    
}
