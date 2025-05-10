// Create Multiple Objects : Create a class Car with attributes brand and year. 
// Create two Car objects in the main method and display their details.
public class Car{
    String brand;
    String year;
    public Car(String brand, String year){
        this.brand = brand;
        this.year = year;
    }
    public void displayDetail(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Year: " + this.year);
    }
    public static void main(String[] args){
        Car car1 = new Car ("Ferrari la Ferrari (F150) ","2013" );
        Car car2 = new Car (" Pagani Huayra ","2011");
        
    car1.displayDetail();
    car2.displayDetail();
    }
}