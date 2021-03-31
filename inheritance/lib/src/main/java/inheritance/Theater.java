package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater implements ReviewAble, ReviewWithMovieAble {
    String name;
    int rating;
    List<String> movies;
    List<Review> reviewList = new ArrayList<>();


    public Theater(String name, List<String> movies) {
        this.name = name;
        this.movies = movies;
        this.rating = 5;
    }

    public String toString() {
        return String.format("This is the Theater: Name: %s, Movies that are playing: %s, Rating: %s", name, movies, rating);
    }

    public void addMovie(String movie) {
        this.movies.add(movie);
    }

    public void removeMovie(String movie) {
        this.movies.removeIf(mov -> mov.equals(movie));
    }

    @Override
    public int addReviewWithMovie(String body, String author, int stars, String movie) {
        Review review = new Review(body, author, stars, movie);
        review.body = body;
        review.author = author;
        review.stars = stars;
        review.movie = movie;
        reviewList.add(review);
        int numStars = 0;
        int counter = 0;
        for (Review reviews : reviewList) {
            numStars += reviews.stars;
            counter++;
        }
        this.rating = numStars / counter;
        System.out.println(review.movie);
        return this.rating;
    }

    @Override
    public int addReview(String body, String author, int stars) {
        Review review = new Review(body, author, stars);
        review.body = body;
        review.author = author;
        review.stars = stars;
        reviewList.add(review);
        int numStars = 0;
        int counter = 0;
        for (Review reviews : reviewList) {
            numStars += reviews.stars;
            counter++;
        }
        this.rating = numStars / counter;
        return this.rating;

    }


    @Override
    public void printReview() {
        for (Object element : this.reviewList) {
            System.out.println(element.toString());
        }
    }
}



