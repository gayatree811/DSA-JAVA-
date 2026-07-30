package OOPS;

public class ParameterizedConst {
    String name;
    int age;

    //parameterized constructor
    ParameterizedConst(String n, int a ){
        name = n;
        age = a;
    }
    void display(){
         System.out.println("name " + name);
         System.out.println("age " + age);
}
public static void main(String[] args) {
    ParameterizedConst s1 = new ParameterizedConst("Preety", 29);
     s1.display();
}
}
