package OOPS;

public class DeepCopy {
    String name ;
    int age;
    int marks [];

    //default constructor
    DeepCopy(){
        marks = new int[3];
    }

    //deep constructor
    DeepCopy(DeepCopy s1){
        this.name = s1.name;
        this.age = s1.age;

        //create a new array
        this.marks = new int[3];

        //copy each elements from s1 array
        for(int i =0; i < 3 ; i ++){
            this.marks[i] = s1.marks[i];
        }
    }
        void display(){
            System.out.println(name);
            System.out.println(age);
        
            System.out.print("marks");

            for(int i =0; i< 3 ; i++){
                System.out.println(marks[i] + " ");
            }
            System.out.println();
    }
    public static void main(String[] args) {
        DeepCopy s1 = new DeepCopy();

        s1.name = "Gayatree";
        s1.age = 20;

        s1.marks[0] = 90;
        s1.marks[1] = 92;
        s1.marks[2] = 94;

        //create a deep copy
        DeepCopy s2 = new DeepCopy(s1);

        //change s2
        s2.marks[2] = 80;

        System.out.println("student 1");
        s1.display();
        System.out.println();

        System.out.println("Student 2");

        s2.display();
    }

}
