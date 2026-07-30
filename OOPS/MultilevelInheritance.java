package OOPS;
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("bark");
    }
}
class puppy extends Dog{
    void weep(){
        System.out.println("weep");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        puppy p = new puppy();
       p.eat();
        p.bark();
        p.weep();
    }
}
