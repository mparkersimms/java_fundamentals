package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TheaterTest {
    @Test
    public void TheaterTester() {
//        Testing to see if the toString method is functioning
        List<String> movies = new ArrayList<>();
        movies.add("Terminator");
        movies.add("Inglorious Basterds");
        movies.add("The Hangover");
        movies.add("The Town");
        Theater testTheater = new Theater("testTheater", movies);
        System.out.println(testTheater.toString());
        String name = "testTheater";
        assertEquals("The name should be test", name, testTheater.name);
        String movie = "Terminator";
        assertEquals("The name should be test", movie, testTheater.movies.get(0));
//
//        Testing with Different variables
        String name2 = "testTheater2";
        Theater testTheater2 = new Theater("testTheater2", movies);
        String movie2 = "The Hangover";
        assertEquals("The name should be test", movie2, testTheater2.movies.get(2));

//        Testing the reviewWithMovie inheritance
        testTheater.addReviewWithMovie("The theater was great and the movie was good too", "Joe MovieBuff",4, "Scarface");
        System.out.println(testTheater.reviewList);

//        Testing to see if the shop addReview inheritance is operational
        testTheater.addReview("The movie is okay i guess", "Mickey Mouse", 3);
        testTheater.addReview("The movie is great", "Minnie Mouse", 4);
        testTheater.addReview("The movie is super", "Donald Duck", 1);
        testTheater.printReview();
        System.out.println(testTheater.rating);
        int expected = (4+3+4+1)/4;
        int actual = testTheater.rating;
        assertEquals("The ratings should be equal", expected, actual);

//        Testing the addMovie instance
        testTheater.addMovie("Scarface");
        System.out.println(testTheater.movies);
        String movie3 = "Scarface";
        assertEquals("The name should be test", movie3, testTheater.movies.get(4));

//        Testing the removeMovie instance
        testTheater.removeMovie("The Hangover");
        System.out.println(testTheater.movies);
        String movie4 = "The Hangover";
        boolean containsMovie = testTheater.movies.contains(movie4);
        assertFalse(containsMovie);





    }
}