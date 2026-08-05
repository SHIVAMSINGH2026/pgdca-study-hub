// Practical-38: Write a Java Program to find area of Circle, Rectangle, Square, and Triangle using separate classes and objects.
import mypackage.FindAreaOfCircle;
import mypackage.FindAreaOfRectangle;
import mypackage.FindAreaOfSquare;
import mypackage.FindAreaOfTriangle;

public class allareafind {
    public static void main(String[] args) {
        FindAreaOfCircle s1 = new FindAreaOfCircle();
        FindAreaOfRectangle s2 = new FindAreaOfRectangle();
        FindAreaOfSquare s3 = new FindAreaOfSquare();
        FindAreaOfTriangle s4 = new FindAreaOfTriangle();

        System.out.println("Area of Circle: " + s1.areaofcircle(11));
        System.out.println("Area of Rectangle: " + s2.areaofrectangle(12, 11));
        System.out.println("Area of Square: " + s3.areaofsquare(6));
        System.out.println("Area of Triangle: " + s4.areaoftriangle(5, 6));
    }
}

/* Output:
Area of Circle: 380.132711084365
Area of Rectangle: 132.0
Area of Square: 36.0
Area of Triangle: 15.0
*/
