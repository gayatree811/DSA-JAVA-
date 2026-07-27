package OOPS;
public class OopsBasic {
    String name;
    int age;

    void display(){
        System.out.println(name + " " + age);
    }
    public static void main(String[] args) {
        OopsBasic s1 = new OopsBasic();
        OopsBasic s2 = new OopsBasic();

        s1.name = "Gayatree";
        s1.age = 20;

        s2.name = "Pragya";
        s2.age = 22;
        
        s1.display();
        s2.display();
        
    }
}
