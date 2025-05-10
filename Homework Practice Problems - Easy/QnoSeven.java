// Class Initialization through Constructor Create a class Book with attributes title and author.
//  Initialize them using a constructor, and print the details using a method showBook().

public class QnoSeven {
    String title;
    String Author;

public QnoSeven( String title, String Author){
this.title= title;
this.Author=Author;
}

public void showBook(){
    System.out.println("Title: " + this.title);
    System.out.println("Author:" + this.Author);
}

public static void main(String[] args){
QnoSeven myBook = new QnoSeven("The Alchemist ", " Paulo Coelho");
myBook.showBook();
} 
} 
