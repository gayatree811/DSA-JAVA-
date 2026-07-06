//Question 1 :Print the number of 7’s that are inthe 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2

public class SearchIn {

    public static int countseven(int matrix[][]){
        int count =0;
        for(int i =0 ; i < matrix.length; i++){
            for(int j =0 ; j <matrix[0].length; j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {4,7,8},
            {8,8,7}
        };
        int result = countseven(matrix);
        System.out.println("number of 7's = " + result);
    }
}