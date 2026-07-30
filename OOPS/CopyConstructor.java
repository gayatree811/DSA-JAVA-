package OOPS;

public class CopyConstructor {
  String name;
  int age;

  //parameterized constructor
  CopyConstructor(String name, int age){
    this.name = name;
    this.age = age;
  }
  //copy constructor
  CopyConstructor(CopyConstructor obj){
    this.name = obj.name;
    this.age = obj.age;

  }
  void display(){
    System.out.println(name);
    System.out.println(age);
  }
  public static void main(String[] args) {
    CopyConstructor s1 = new CopyConstructor("gayatree", 27);
    CopyConstructor s2 = new CopyConstructor(s1);
    s1.display();
    s2.display();
  }
}
