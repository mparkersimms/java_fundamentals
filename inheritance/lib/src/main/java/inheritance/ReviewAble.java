package inheritance;

import java.util.List;

public interface ReviewAble {
    void addReview(String body, String author, int stars);
    void printReview(List<Review> reviewList);
}
