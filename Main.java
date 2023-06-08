import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This program contains the main
 * class. Referenced from video.
 *
 * @author  Sarah Andrew
 * @version 1.0
 *
 * @since 2023-02-05.
 */

public class Main {
    public static void main(String[] args) {
        // Pass path to file as parameter.
        final File file = new File("input.txt");
        final File fileOut = new File("output.txt");

        try {
            // Create a new list.
            final List<student> listOfStudents = 
                new ArrayList<>();

            // Create FileWriter object to write to file.
            final FileWriter fW = new FileWriter(fileOut);
            // Create Scanner object to read from file.
            final Scanner sc = new Scanner(file);
            // Create PrintWriter object to write to file.
            final PrintWriter write = new PrintWriter(fW);

            while (sc.hasNextLine()) {
                // Read line as string.
                final String newLine = sc.nextLine();

                // Declare array & variables.
                final String[] arraySpace = newLine.split(" ");
                final String firstName = arraySpace[0];
                final String lastName;
                final String midInti = "";
                int grade = 0;
                boolean iep = false;


                // Displays the user full name & grade.
                if (midInti.isEmpty()) {
                    // Create an instance.


                }

            }
            // Closes scanner & writer.
            write.close();
            sc.close();
        } catch (IOException error) {
            // Displays error to user.
            System.out.println("An error occurred: "
                    + error.getMessage());
        }

}

