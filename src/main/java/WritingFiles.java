
// Importing java input output classes
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.FileWriter;
import java.io.BufferedWriter;

// Main class


public class WritingFiles {
}

// need java 11(!)
// Java Program to Write Into a File
// using writeString() Method
class WriteUsingWriteString {

    // Main driver method
//    public static void main(String[] args)
//            throws IOException
//    {
//        // Assigning the content of the file
//        String text = "Zip Code Wilmington Rocks.";
//
//        // Defining the file name of the file
//        Path fileName = Path.of("demo.txt");
//
//        // Writing into the file
//        Files.writeString(fileName, text);
//
//        // Reading the content of the file
//        String file_content = Files.readString(fileName);
//
//        // Printing the content inside the file
//        System.out.println(file_content);
//    }
}

// Java Program to Write into a File
// using FileWriter Class
class WriteUsingFileWriter {

    // Main driver method
    public static void main(String[] args) {

        // Content to be assigned to a file
        // Custom input just for illustratinon purposes
        String text = "Zip Code Wilmington Rocks.";

        // Try block to check if exception occurs
        try {
            // Create a FileWriter object
            // to write in the file
            FileWriter fWriter = new FileWriter(
                    "demo3.txt");
            // Writing into file
            // Note: The content taken above inside the
            // string
            fWriter.write(text);
            // Printing the contents of a file
            System.out.println(text);
            // Closing the file writing connection
            fWriter.close();
            // Display message for successful execution of
            // program on the console
            System.out.println(
                    "File is created successfully with the content.");
        }

        // Catch block to handle if exception occurs
        catch (IOException e) {
            // Print the exception
            System.out.print(e.getMessage());
        }
    }
}

// Java Program to write into a File
// Using BufferedWriter Class
class WriteUsingBufferedWriter {

    // Main driver method
    public static void main(String[] args) {
        // Assigning the file content
        // Note: Custom contents taken as input to
        // illustrate
        String text = "Zip Code Wilmington Rocks.";

        // Try block to check for exceptions
        try {
            // Step 1: Create an object of BufferedWriter
            BufferedWriter f_writer = new BufferedWriter(
                    new FileWriter("demo2.txt"));

            // Step 2: Write text(content) to file
            f_writer.write(text);
            // Step 3: Printing the content inside the file
            // on the terminal/CMD
            System.out.print(text);
            // Step 4: Display message showcasing
            // successful execution of the program
            System.out.print(
                    "File is created successfully with the content.");

            // Step 5: Close the BufferedWriter object
            f_writer.close();
        }
        // Catch block to handle if exceptions occurs
        catch (IOException e) {
            // Print the exception on console
            // using getMessage() method
            System.out.print(e.getMessage());
        }
    }
}


// Java Program to Write into a File
// using FileOutputStream Class

class WriteUsingFileOutputStream {

    // Main driver method
    public static void main(String[] args)  {
        // Assign the file content
        String fileContent = "Zip Code Wilmington Rocks.";
        FileOutputStream outputStream = null;
        // Try block to check if exception occurs
        try {
            // Step 1: Create an object of FileOutputStream
            outputStream = new FileOutputStream("file.txt");
            // Step 2: Store byte content from string
            byte[] strToBytes = fileContent.getBytes();
            // Step 3: Write into the file
            outputStream.write(strToBytes);
            // Print the success message (Optional)
            System.out.print(
                    "File is created successfully with the content.");
        }
        // Catch block to handle the exception
        catch (IOException e) {
            // Display the exception/s
            System.out.print(e.getMessage());
        }
        // finally keyword is used with in try catch block
        // and this code will always execute whether
        // exception occured or not
        finally {
            // Step 4: Close the object
            if (outputStream != null) {
                // Note: Second try catch block ensures that
                // the file is closed even if an error
                // occurs
                try {
                    // Closing the file connections
                    // if no exception has occured
                    outputStream.close();
                }
                catch (IOException e) {
                    // Display exceptions if occured
                    System.out.print(e.getMessage());
                }
            }
        }
    }
}


