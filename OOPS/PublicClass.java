package OOPS;

public class PublicClass {
    public String name ="gayatree";

    public void display(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        PublicClass s1 = new PublicClass();
        s1.display();
    }
}
