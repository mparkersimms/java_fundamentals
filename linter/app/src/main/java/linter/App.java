/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        readfile("app/src/main/resources/gates.js");
    }

    public static int readfile(String filePathString){
        File gatesFile = new File(filePathString);
        Scanner gatesScanner;
        try{
            gatesScanner = new Scanner(gatesFile);
        }catch(FileNotFoundException exception){
            System.out.println("Sorry, something went wrong, " +
                    "we're trying to resolve the issue");
            System.out.println(exception);
            return -1;
        }
        int counter = 0;
        List<String> testList = new ArrayList<>();
        while(gatesScanner.hasNext()){
            String line = gatesScanner.nextLine();
            counter++;
//            System.out.println(line);
//            System.out.println(counter);
            if(!line.isEmpty() && !line.endsWith("{") &&
                    !line.endsWith("}") && !line.contains("if") &&
                    !line.contains("else") && !line.endsWith(";")){
//                System.out.println("Line: " + counter + " Missing semicolon.");
                testList.add("\nLine: " + counter + " Missing semicolon.");

            }

        }
//        System.out.println(testList);
//        System.out.println(testList.size());
        int result = testList.size();
        System.out.println(result);

        return result;
    }
}
