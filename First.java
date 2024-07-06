/*
Practice Question: Calculating the Area of a Rectangle

Objective:
Write a Java program that calculates the area of a rectangle. The program should prompt the user to enter the length and width of the rectangle, and then output the area.

Requirements:

The program should prompt the user to enter the length of the rectangle.
The program should prompt the user to enter the width of the rectangle.
The program should calculate the area using the formula: Area = Length * Width.
The program should output the calculated area.
Example:

yaml
Copy code
Enter the length of the rectangle: 5
Enter the width of the rectangle: 3
The area of the rectangle is: 15 
 */
import java.util.Scanner;

 public class First{
    public static void main(String[] args){
        int length, width, area;
        Scanner myObj = new Scanner(System.in); // importing and defining the scanner object to read user input
            System.out.print("What is the length of rectangle: ");
            length = myObj.nextInt(); //read user input for length

            System.out.println("What is the width of the rectangle: ");
            width = myObj.nextInt();

            area = length * width;
            System.out.println("The area of the rectangle is: " + area);
    }
 }