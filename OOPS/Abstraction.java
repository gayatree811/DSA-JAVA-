package OOPS;

abstract class animal{
    abstract void sound();
    void eat(){
        System.out.println("animal eats");
    }
}

class dog extends animal{
    @Override
    void sound(){
        System.out.println("dog barks");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.eat();
    }
}
