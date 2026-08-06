/* 📝 Question: Student Management System (Easy)

Create a Java program to manage student records.

Requirements:
Create a class named Student.
The class should have the following data members:
id
name
marks
Create a parameterized constructor to initialize these values.
Create a method named display() to print the student's details.
In the main() method:
Create an array of 3 Student objects.
Take input from the user using Scanner.
Store each student's details in the array.
Display the details of all students. */

package OOPS.PracticeQuestion;
import java.util.*;
class student{
    int id;
    String name;
    int marks;

    student(int id, String name,int marks){
        this.id = id ;
        this.name = name;
        this.marks = marks;
    }

void display(){
    System.out.println("Id" + id);
    System.out.println("name" + name);
    System.out.println("marks" + marks);
}
}
public class Studentmanage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student[] s = new student[3];
        for(int i =0; i<3;i++){
            System.out.println("enter id");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.println("enter name");
            String name = sc.nextLine();

            System.out.println("enter marks");
            int marks = sc.nextInt();

            s[i]= new student(id, name, marks);
        }
        System.out.println("\n student details");
        for(int i =0; i<3;i++){
            s[i].display();
            System.out.println();
        }
        sc.close();
    }
}
