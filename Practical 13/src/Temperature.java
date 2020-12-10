import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        int numberOfReadings = 5;
        ArrayList<Integer> readings = new ArrayList<>();
        //declare the scanner, String for reading and int for value, we only have to do this only once.
        Scanner scanner = new Scanner(System.in);
        String readingIn;
        int value;

        //prints out the reading message and gets the input n times.
        for (int i = 0; i < numberOfReadings; i++) {
            try {
                System.out.println("Enter reading " + (i + 1));
                readingIn = scanner.nextLine();
                //get the int value of the input (note in try catch to handle incorrect input)
                value = Integer.parseInt(readingIn.substring(0, readingIn.length() - 1));
                //add the cleaned value to the ArrayList
                readings.add(value);
            }
            catch(NumberFormatException e){
                System.out.println("Error in input");
                //reduce the counter to ensure correct number of readings.
                i--;
            }
        }

        // local variable to store the readingsSum of speed readings
        // Loops through the ArrayList and add the readings together
        int readingsSum = 0;
        for(int reading : readings){
            readingsSum += reading;
        }

        System.out.println(readings.size() + " Readings");
        System.out.println( "Min Temp: " + Collections.min(readings));
        System.out.println( "Max Temp: " + Collections.max(readings));
        System.out.println( "AVG Temp: " + (readingsSum / readings.size()));
    }
}
