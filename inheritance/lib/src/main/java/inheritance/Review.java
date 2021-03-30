package inheritance;

public class Review {
    String body;
    String author;
    int stars;

    public Review (String body, String author, int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;

        }


    public String toString(){
            return String.format("This is the restaurant review: " +
                    "Body: %s, Author: %s, Number of Stars: %d", body, author, stars);
    }
}
