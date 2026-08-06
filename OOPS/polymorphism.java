package OOPS;
class animal{
    void sound(){
        System.out.println("Animla makes sound");
    }
}

class dog extends animal{
    @Override
    void  sound(){
        System.out.println("dog barks");
    }
    void eat(){
        System.out.println("dog eats");
    }
    void eat(String food){
        System.out.println("dog eats" + food);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        animal a = new dog();
        a.sound();

        //overloading
        dog d = new dog();
        d.eat();
        d.eat("meat");
    }
    
}
