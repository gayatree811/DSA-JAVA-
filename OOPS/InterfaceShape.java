package OOPS;
interface shape{
    void area();
}

class circle implements shape{
    double radious = 8;
    public void area(){
        double result = 3.14 * radious * radious;
        System.out.println("area of circle = " + result);

    }
}
class square implements shape{
    double side = 7;
    public void area(){
        double result = side * side ;
        System.out.println("area of squre is " + result);
    }

}
public class InterfaceShape {
    public static void main(String[] args) {
        shape s;
        s = new circle();
        s.area();
        s = new square();
        s.area();
    }
}
