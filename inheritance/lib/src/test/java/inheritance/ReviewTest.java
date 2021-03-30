package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void reviewTester() {
        Review test = new Review("This is a great test", "Joe Shmoe", 5);
        System.out.println(test.toString());
        String body = "This is a great test";
        assertEquals("The body should be \"This is a great test\"", body, test.body);
        String author = "Joe Shmoe";
        assertEquals("The author should be one Joe Shmoe", author, test.author);
        String testString = "This is the restaurant review: Body: This is a great test, " +
                "Author: Joe Shmoe, Number of Stars: 5";
        assertEquals("The strings should be equal", testString, test.toString());
    }
}