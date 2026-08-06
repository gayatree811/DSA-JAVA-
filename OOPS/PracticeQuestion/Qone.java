/* Student Management System (Java)
Problem Statement

Create a Student class with:

id
name
marks

Requirements:

Use a parameterized constructor.
Create a method displayDetails().
Create a method calculateGrade().
Grade Criteria:
90–100 → A
80–89 → B
70–79 → C
60–69 → D
Below 60 → F

Create 3 student objects and display their details */

package OOPS.Practice Question;
class Student{
    String name;
    int id;
    double marks;
}
//parameterized constructor
Student(int id , String name, double marks){
    this.id = id;
    this.name = name;
    this.marks = marks;
} 
//calculate grade
String calculation(){
    if(marks >= 90)
        return "A";
    else if(marks >= 80)
        return "B";
    else if(marks >=70)
        return "C";
    else if(marks >= 60)
        return "D";
    else 
        return "F";
}

//display details
void displayDetails(){
    System.out.println("ID: " + id);
    System.out.println("Name: " + id);
    System.out.println("Marks: " + id);
    System.out.println("Grade: " + id);
    System.out.println("------------");
}


public class Qone {
    public static void main(String[] args) {
        Student s1 = new Student(101, "prince", 90);
        Student s2 = new Student(102, "pri", 95);
        Student s3 = new Student(101, "prince", 90);
    }
}
