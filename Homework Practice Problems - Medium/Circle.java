// Constants Usage Example Create a Circle class with an attribute radius. Use a final constant PI = 3.14159. 
// Write a method calculateCircumference() and calculateArea() using PI. Create two Circle objects and display their area and circumference.

class Circle{
double radius;
public static final double PI = 3.14159;
public Circle(double radius){
    this.radius = radius;
}
public double calculateCircumference(){
    return 2* PI * radius;
}
public double calculateArea(){
    return PI * radius * radius;
}
public void displayCircleDetails(){
    System.out.println("Radius :" + radius);
    System.out.println("Area of Circle: " +calculateArea());
    System.out.println("Circumference:" + calculateCircumference());
    System.out.println("__________________");
}
public static void main(String[] args){
    Circle C1 = new Circle(6.5);
    Circle C2 = new Circle(7);
    Circle C3 = new Circle(5.5);
    C1.displayCircleDetails();
    C2.displayCircleDetails();
    C3.displayCircleDetails();
}
}