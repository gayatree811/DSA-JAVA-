package OOPS;
class Vehicle{
    void start(){
        System.out.println("vehicle started");
    }
}
class car extends Vehicle{
    void drive(){
        System.out.println("Car is running");
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        car c1 = new car();
        c1.start();
        c1.drive();
        
    }
}
