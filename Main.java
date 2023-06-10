import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            // new file object
            final File input = new File("input.txt");

            // Creating the writer
            final FileWriter output = new FileWriter("output.txt");

            // Creating the scanner.
            final Scanner scanner = new Scanner(input);
            try {
                ArrayList<Student> studentList = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    // getting the line 
                    String line = scanner.nextLine();
                    // splitting the student attributes
                    String[] attributes = line.split(" ");
                    // Creating the student based off the number of attributes.
                    // Ternary operator is being used here, I know its not been
                    // covered in class, but it was something I learned during
                    // my co-op
                    Student student = (attributes.length == 4) ? new Student(
                            attributes[0], attributes[1],
                            Integer.parseInt(attributes[2]),
                            Boolean.parseBoolean(attributes[3]))
                            : new Student(attributes[0], attributes[1],
                                    attributes[2],
                                    Integer.parseInt(attributes[3]),
                                    Boolean.parseBoolean(attributes[4]));
                    // Adding to the student list
                    studentList.add(student);
                }
                // Setting up some output in the output file
                output.write("There are " + Integer.toString(studentList.size()) + " students"
                    + " in the student list. \nThe students are:\n");
                // For loop creates the output
                for (Student aStudent : studentList) {
                    String stuOutput = aStudent.print();
                    System.out.println(stuOutput);
                    output.write(stuOutput + "\n");
                }
                output.close();
            } catch (NumberFormatException error) {
                System.out.println("ERROR:  " + error);
            }


        } catch (IOException error) {
            System.out.println("ERROR: " + error);
        }
    }
}
