/* Practice Exercises Create a Car class with: brand color price displayDetails() method Create two Car objects with different values and print their details */
package OOPS;
 class CarClass {
    String brand;
    String color;
    double price;

    void displayDetails(){
        System.out.println("Brand " + brand);
        System.out.println("Color " + color);
        System.out.println("Price " + price);
    }
    public static void main(String[] args) {
        CarClass car1 = new CarClass();
        car1.brand = "Toyata";
        car1.color = "white";
        car1.price = 130000;

        CarClass car2 = new CarClass();
        car2.brand = "BMW";
        car2.color = "Red";
        car2.price = 299192;

        car1.displayDetails();
        car2.displayDetails();

    }
}
