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
            final List<Student> listOfStudents = new ArrayList<>();

            // Create FileWriter object to write to file.
            final FileWriter fW = new FileWriter(fileOut);
            // Create Scanner object to read from file.
            final Scanner sc = new Scanner(file);
            // Create PrintWriter object to write to file.
            final PrintWriter write = new PrintWriter(fW);

            while (sc.hasNextLine()) {
                // Read line as string.
                final String newLine = sc.nextLine();

                // In case of user entering empty line,
                // display no strings found.
                if (newLine.equals("")) {
                    System.out.println("No data found on line.");
                    continue;
                }

                // Declare array & variables.
                final String[] arraySpace = newLine.split(" ");
                final String firstName = arraySpace[0];
                final String lastName;
                String midInti = "";
                int grade = 0;
                boolean iep = false;
                Student student;

                // Checks to see if middle name
                // is present.
                if (arraySpace.length >= 5) {
                    // Sets specified index.
                    midInti = arraySpace[1];
                    lastName = arraySpace[2];
                    grade = Integer.parseInt(arraySpace[3]);
                    iep = arraySpace[4].equals("y");
                } else {
                    lastName = arraySpace[1];
                    grade = Integer.parseInt(arraySpace[2]);
                    // To see if IEP is present.
                    iep = arraySpace[3].equals("y");
                }

                // Format information & calls method.
                if (!midInti.isEmpty()) {
                    // Create a new Student object and add it to the list.
                    student = new Student(firstName, lastName,
                        midInti, grade, iep);
                    student.print();
                } else {
                    // Create a new Student object and add it to the list.
                    student = new Student(firstName,
                            lastName, grade, iep);
                    student.print();
                }

                // Add student to list.
                listOfStudents.add(student);

                // Declare variable & display how
                // many students are in said class.
                final int amountStudent = listOfStudents.size();
                System.out.println("There are " + amountStudent
                        + "  students in the class.");
                System.out.println("");
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
}
