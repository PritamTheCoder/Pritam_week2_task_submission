// Product Discount Calculator Create a class Product with productName, price, and discountPercentage.
// Write a method calculateFinalPrice() which returns price after discount. Create 3 different products and print their final prices.
class Product{
    String productName;
    double price;
    double discountPercentage;
    public Product(String productName, double price, double discountPercentage){
        this.productName = productName;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }
    public void calculateFinalPrice(){
        double discount;
        double discountedPrice;
        discount = price * (discountPercentage/100);
        discountedPrice = price - discount;
        System.out.println("Product name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("discountPercentage: " + discountPercentage+ "%");
        System.out.println("Discount amount: $" +discount);
        System.out.println("Final Price:" + discountedPrice);
    }
    public static void main(String[] args){
        Product pro1 = new Product("iPhone 16 pro max", 2600, 10);
        Product pro2 = new Product("Samsung s25 ultra", 1900, 15);
        Product pro3 = new Product("Ferrari la Ferrari:", 480000,14);

        pro1.calculateFinalPrice();
        pro2.calculateFinalPrice();
        pro3.calculateFinalPrice();
    }
}