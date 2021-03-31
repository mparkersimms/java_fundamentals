package inheritance;

public class Review {
    String body;
    String author;
    int stars;
    String movie;

    public Review (String body, String author, int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;

    }
    public Review (String body, String author, int stars, String movie){
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movie = movie;

    }



    public String toString(){
            return String.format("This is the review: " +
                    "Body: %s, Author: %s, Number of Stars: %d", body, author, stars);
    }
}
