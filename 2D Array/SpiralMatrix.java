public class SpiralMatrix {
    public static void SpiralMatrix(int matrix[][]){

        int startRow = 0;
        int endRow = matrix.length - 1 ;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while(startRow <=endRow && startCol <= endCol){
            // top row
            for(int j = startCol; j <=endCol;j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            //right colum
            for(int i = startCol+1; i <= endRow; i++){
                System.out.print(matrix[i][endCol]+ " ");
            }
            //buttom row
            for (int j = endCol-1; j >= startCol; j--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }
            // left colum
            for (int i = endRow - 1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}     
            
        };
         SpiralMatrix(matrix);
    }
}
