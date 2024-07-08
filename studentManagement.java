/*Prompt: Simple Student Management System
Create a simple program to manage student records using 
Object-Oriented Programming principles in Java.
Requirements
Student Class:
Attributes: name (String), studentID (String), grade (double).
Methods:
Constructor to initialize the attributes.
Getters and setters for each attribute.
displayStudentDetails() method to print the student's details.
StudentManagement Class:
Main method to create and manage student objects.
Methods to add students to a list and display all students' details.
Instructions
Define the Student Class:
Create a Student class with the specified attributes and methods.
Implement the displayStudentDetails() method to print the details 
of the student.
Define the StudentManagement Class:
Create a StudentManagement class with a main method.
In the main method, create a few Student objects, add them to a list, 
and display their details.

Tasks
Define the Student class with the required attributes and methods.
Create a StudentManagement class with a main method.
Instantiate a few Student objects and add them to an ArrayList.
Iterate over the list and call the displayStudentDetails() 
method for each student to print their details.

*/
import java.util.ArrayList;
 class Second {
    
    //Private Instance Variables
    private String name;
    private String studentID;
    private double grade;

    //Constructors
    public Second(String name, String studentID, double grade) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
    }

    public Second(double grade, String name, String studentID) {
        this.grade = grade;
        this.name = name;
        this.studentID = studentID;
    }
    // Getter Methods
    public String getName() {
        return name;
    }
    public String getStudentID() {
        return studentID;
    }
    public double getGrade() {
        return grade;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Student Id: " + studentID);
        System.out.println("Grade: " + grade);
    }
}

public class studentManagement{
    public static void main(String[] args) {
        // creating a list to store student objects
        ArrayList<Second> student = new ArrayList<>();
        student.add(new Second("Michele", "S01", 90.5));
        student.add(new Second("Daniela","S02", 93));
        student.add(new Second("Isabelle", "S03", 83));
       for (Second second : student) {
        student.displayStudentDetails();
        System.out.println();
       }
    }
}
    




