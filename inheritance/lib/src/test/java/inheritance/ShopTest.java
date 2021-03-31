package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void ShopTester() {
//        Testing to see if the toString method is functioning
        Shop testShop = new Shop("testShop", "This is just a test shop that sells tests and other related test things", "$$");
        System.out.println(testShop.toString());
        String name = "testShop";
        assertEquals("The name should be test", name, testShop.name);
        String price = "$$";
        assertEquals("The name should be test", price, testShop.price);

//        Testing with Different variables
        Shop testShop2 = new Shop("testShop2", "This is just a test shop that doesn't sell tests", "$$$");
        String name2 = "testShop2";
        assertEquals("The name should be test", name2, testShop2.name);
        String price2 = "$$$";
        assertEquals("The name should be test", price2, testShop2.price);
//        Testing to see if the shop addReview inheritance is operational
        testShop.addReview("The shop is okay i guess", "Mickey Mouse", 3);
        testShop.addReview("The shop is great", "Minnie Mouse", 4);
        testShop.addReview("The shop is super", "Donald Duck", 1);
        testShop.printReview();
        System.out.println(testShop.rating);
        int expected = (3+4+1)/3;
        int actual = testShop.rating;
        assertEquals("The ratings should be equal", expected, actual);


    }
}
