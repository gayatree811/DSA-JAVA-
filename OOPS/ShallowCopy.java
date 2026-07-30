package OOPS;

public class ShallowCopy {
   String name;
   int age;
   int marks[];

   //constructor
   ShallowCopy(){
    marks = new int[3];
   }

   //copy constructor->shallow
   ShallowCopy(ShallowCopy s1){
    this.name = s1.name;
    this.age = s1.age;
    this.marks = s1.marks;
   }
   void display(){
    System.out.println("name" + name);
    System.out.println("age" + age);

    System.out.println("marks" );
    for(int i =0; i<3; i++){
        System.out.print(marks[i] + " ");
    }
    System.out.println();
   }

   public static void main(String[] args) {
    ShallowCopy s1 = new ShallowCopy();


    s1.name = "Gayatree";
    s1.age = 20;

    s1.marks[0] = 90;
    s1.marks[1] = 94;
    s1.marks[2] = 92;

    ShallowCopy s2 = new ShallowCopy(s1);

    s2.marks[2] = 27;

    s1.display();
    s2.display();   
   }
}
