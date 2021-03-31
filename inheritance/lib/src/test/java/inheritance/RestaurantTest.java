package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void restaurantTester() {
        Restaurant test = new Restaurant("test", "$");
        System.out.println("this is just a test");
        System.out.println(test.toString());
        String name = "test";
        assertEquals("The name should be test", name, test.name);
        String price = "$";
        assertEquals("The price should be one $", price, test.price);
        String testString = "This is the restaurant: Name: test, Price: $, Rating: 5";
        assertEquals("The strings should be equal", testString, test.toString());
        test.addReview("This is okay","Joe", 5);
        test.addReview("This is great","Me", 5);
        test.addReview("This is great","Me", 1);
        test.addReview("This is great","Me", 5);
        test.addReview("This is great","Me", 0);



        test.printReview();
        System.out.println(test.toString());
    }
}