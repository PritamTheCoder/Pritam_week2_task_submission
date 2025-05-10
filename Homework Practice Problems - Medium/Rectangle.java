// Rectangle and Area Calculation Create a class Rectangle with length and width. Initialize using a constructor. 
// Create a method calculateArea() that returns the area. Create 3 rectangles of different dimensions and display their areas.
public class Rectangle{
double length;
double width;
public Rectangle(int length,int width){
    this.length = length;
    this.width = width;
}
public double calculateArea(){
return length * width;
}
public void displayArea(){
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
    System.out.println("Area: " + calculateArea());
    System.out.println();
}
public static void main (String[] args){
Rectangle Rectangle1 = new Rectangle (25, 5);
Rectangle Rectangle2 = new Rectangle( 45, 8);
Rectangle Rectangle3 = new Rectangle(33,9); 
Rectangle1.displayArea();
Rectangle2.displayArea();
Rectangle3.displayArea();
}
}