//Question 3 :Write a program to FindTransposeofa Matrix

public class transposeOfMatrix {
    public static void main(String[] args){
        int matrix[][] = {
            {1,2,3},
            {4,5,6}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;

        //create transpose matrix
        int transpose[][] = new int[cols][rows];
        // find transpose
        for(int i =0 ; i <rows; i++){
            for(int j =0 ; j< cols; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose matrix is");
        for(int i =0 ; i< transpose.length; i++){
            for(int j =0 ; j< transpose[0].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
