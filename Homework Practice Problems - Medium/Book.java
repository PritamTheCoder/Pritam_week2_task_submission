// Book Library (Manual Objects) Create a Book class with attributes: title, author, ISBN. In the main() method, 
// create 5 different Book objects manually and display their details using a method showDetails().
public class Book{
    String title;
    String author;
    int ISBN;
public Book(String title, String author, int ISBN){
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
}
public void showDetails(){
    System.out.println("Title : "+ this.title);
    System.out.println("Author: " + this.author);
    System.out.println("ISBN: "+ this.ISBN);
}
public static void main(String[] args){
    Book Book1= new Book("Klara And The Sun", "Kazuo Ishiguro", -2267);
    Book Book2 = new Book("Data Structures and Algorithm", " Miguel SanAguel", 125467000 );
    Book Book3 = new Book("The Last Air Bender" , "Fortman Gilbert", 1254000 );
    Book Book4 = new Book("Linear Algebra", " Colbert Henferson", 12546000 );
    Book Book5 = new Book("The art of seven rings", " Miyamoto Mushashi", 0001234);
Book1.showDetails();
Book2.showDetails();
Book3.showDetails();
Book4.showDetails();
Book5.showDetails();
}
}