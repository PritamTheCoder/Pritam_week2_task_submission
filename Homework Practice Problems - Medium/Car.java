// Manual Car Showroom Inventory Create a Car class with attributes: brand, model, price. 
// Create 5 different Car objects with different details. Display the cars whose price is greater than 20,00,000 (use if statement).
class Car{
    String brand;
    String model;
    double price;
    public Car(String brand, String model, double price){
        this.brand = brand;
        this.model= model;
        this.price = price;
    }
    public void showCars(){
        if(price > 2000000){
            System.out.println("Brand :" +brand);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
            System.out.println("________________________");
        }
    }
    public static void main(String [] ergs){
        Car car1 = new Car("Tesla", "Model S", 2500000);
        Car car2 = new Car("BMW", "X5", 1800000);
        Car car3 = new Car("Mercedes-Benz", "E-Class", 2200000);
        Car car4 = new Car("Toyota", "Land Cruiser", 3000000);
        Car car5 = new Car("Honda", "Civic", 1500000);
        car1.showCars();
        car2.showCars();
        car3.showCars();
        car4.showCars();
        car5.showCars();
    } 
}