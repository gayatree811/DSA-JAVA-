public class SearchSortedMatrix {
    public static void search(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length -1 ;
/* 
        while(row < matrix.length && col >=0){
            if (matrix[row][col]==key){
                return true;
            }
            else if(matrix[row][col]>key){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int key = 8;

        if (search(matrix, key)) {
            System.out.println("Key Found");
        } else {
            System.out.println("Key Not Found");
           }
       
 */

    while (row<matrix.length && col >=0){
        if(matrix[row][col] == key){
            System.out.println("key found at index (" + row + "," + col + ")");
            return ;
        }else if (matrix[row][col] > key){
            col--;
        }else{
            row ++;
        }
    }
    System.out.println("key not found");

    }
     public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int key = 8;
        search(matrix, key);
    }
}
