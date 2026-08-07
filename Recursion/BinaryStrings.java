package Recursion;

public class BinaryStrings {
    public static void BinaryStrings(int n , int last , String str){
         //base case
         if(n == 0 ){
            System.out.println(str);
            return;
         }
         //put 0 
         BinaryStrings(n-1, 0, str + "0");
         //put 1 only when last is 0
         if(last == 0){
            BinaryStrings(n-1, 1, str+ "1");
         }
         }
         public static void main(String[] args) {
            BinaryStrings(3, 0, "");
         }
    }
