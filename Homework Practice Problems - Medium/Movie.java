// Movie Details Manager Create a Movie class with attributes: name, language, rating (out of 5).
// Create a method displayMovieDetails(). In main(), create 4 Movie objects and call displayMovieDetails().
class Movie{
    String name;
    String language;
    double rating;
public Movie(String name, String language, double rating){
    this.name = name;
    this.language = language;
    this.rating = rating;
}
public void displayMovieDetails(){
    System.out.println("Movie name: " +this.name);
    System.out.println("Language: " + this.language);
    System.out.println("Rating :" +this.rating + "/5");
    System.out.println("__________________________");
}
public static void main(String[] args){
    Movie movie1 = new Movie("Inception", "English", 4.8);
    Movie movie2 = new Movie("Parasite", "Korean", 4.9);
    Movie movie3 = new Movie("Spirited Away", "Japanese", 4.7);
    Movie movie4 = new Movie("The Godfather", "English", 4.9);
movie1.displayMovieDetails();
movie2.displayMovieDetails();
movie3.displayMovieDetails();
movie4.displayMovieDetails();
}
}
