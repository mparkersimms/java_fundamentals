package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ReviewAble{
    String name;
    String price;
    Review review;
    int rating;



    public Restaurant(String name, String price){
        this.name = name;
        this.rating = 5;
        this.price = price;
    }

    public String toString(){
        return String.format("This is the restaurant: Name: %s, Price: %s, Rating: %d", name, price, rating);
    }
    List<Review> reviewList = new ArrayList<>();
    @Override
    public void addReview(String body, String author, int stars) {
        this.review.body = body;
        this.review.author = author;
        this.review.stars = stars;
        this.rating = (this.rating + stars)/2;
        reviewList.add(this.review);
    }

    @Override
    public void printReview(List<Review> reviewList) {
        for(Object element : reviewList){
            System.out.println(review.toString());
        }
    }
}
