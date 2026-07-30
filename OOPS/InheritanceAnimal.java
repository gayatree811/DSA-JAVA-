package OOPS;

 class Animal {
    void eat(){
        System.out.println("animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

public class  InheritanceAnimal {
 public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.eat();
    d1.bark();
 }
    
}
