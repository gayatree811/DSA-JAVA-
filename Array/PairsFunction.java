public class PairsFunction {
    public static void printpairs(int numbers[]){
        for(int i = 0; i<numbers.length; i++){
            int curr = numbers[i];
            
            //loops for pairs
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
            
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int numbers[]={2,4,5,6,7,8,9};
        printpairs(numbers);
      
    }
    
}
