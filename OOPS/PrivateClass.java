package OOPS;

public class PrivateClass {
 private int age = 20;
 
 private void showAge(){
    System.out.println(age);
 }

 public static void main(String[] args) {
    PrivateClass s1 = new PrivateClass();
    s1.showAge();
 }
}
