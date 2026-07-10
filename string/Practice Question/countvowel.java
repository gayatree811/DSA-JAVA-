/* Write a function to count the number of vowels (a, e, i, o, u) in a string.

Example 1

Input

Programming

Output

3 */
public class countvowel {
    public static int nbrofvowel(String str){
        int count =0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        String str = "programming";
       System.out.println(nbrofvowel(str)); 
    }
    
}