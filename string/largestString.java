public class largestString {
    public static String largeststrfind(String fruits[]){
        String largest = fruits[0];
        for(int i =0 ; i<fruits.length;i++){
            if(fruits[i].compareTo(largest) > 0 ){
                largest = fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String fruits[] = {"apple","banana","mango", "lichhi"};
        System.out.println(largeststrfind(fruits));
    }
}
