import java.lang.Math;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(2);
        clock();

    }

    public static String pluralize(String word, int num) {
        if (num > 1 || num == 0) {
            word = word + "s";
        }

        return word;
    }

    public static String flipNHeads(int num) {
        int flips = 0;
        int headsCounter = 0;
        while (headsCounter < num) {
            flips++;
            if ((Math.random() * 1) >= 0.5) {
                headsCounter++;
                System.out.println("heads");
            } else if ((Math.random() * 1) < 0.5) {
                System.out.println("tails");
                headsCounter = 0;
            }

        }
        System.out.println("It took " + flips + " flips to flip " + num + " heads in a row.");
        return "";
    }

    public static String clock() {
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
            }
            System.out.printf("%02d:%02d:%02d\n",hour, minute, second);
        }  
    }  
}