/* Problem 1 ⭐

Print each character of a string on a new line.

Input

Hello

Output

H
e
l
l
o */

public class printchar {
    public static void chartoprint(String name){
         
         for(int i =0; i<name.length();i++){
            System.out.println(name.charAt(i));
         }
         
    }
    public static void main(String[] args) {
       String name ="HELLO";
       chartoprint(name);
    }
}
