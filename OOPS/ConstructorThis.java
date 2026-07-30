package OOPS;

public class ConstructorThis {
    String name;
    int age;
    //parameterized constructor
    ConstructorThis(String name, int age){
        this.name= name;
        this.age = age;
    }
    void display(){
        System.out.println("name " + name);
        System.out.println("age " + age);


    } 
    public static void main(String[] args) {
        ConstructorThis s1 = new ConstructorThis("Gayatree", 10);

        s1.display();   
    }    
}
