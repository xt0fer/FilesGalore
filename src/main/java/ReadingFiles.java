
import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class ReadingFiles { }

// Java Program to illustrate Reading from FileReader
// using BufferedReader Class
class ReadUsingBufferedReader {

    // main driver method
    public static void main(String[] args) throws Exception {

        File file = new File("test.txt");

        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st);
    }
}

// Java Program to Illustrate reading from
// FileReader using FileReader class

class ReadUsingFileReader {

    // Main driver method
    public static void main(String[] args) throws Exception {

        // Passing the path to the file as a parameter
        FileReader fr = new FileReader("test.txt");

        int i;
        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1)
            // Print all the content of a file
            System.out.print((char)i);
    }
}

// Java Program to illustrate
// reading from Text File
// using Scanner Class
class ReadFromFileUsingScanner
{
    public static void main(String[] args) throws Exception {
        // pass the path to the file as a parameter
        File file = new File("test.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}

// Java Program to illustrate reading from FileReader
// using Scanner Class reading entire File
// without using loop
class ReadingEntireFileWithoutLoop
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner sc = new Scanner(file);

        // we just need to use \\Z as delimiter
        sc.useDelimiter("\\Z");

        System.out.println(sc.next());
    }
}

// Java program to illustrate reading data from file
// using nio.File
class ReadFileIntoList
{
    public static List<String> readFileInList(String fileName) {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }
        catch (IOException e) {
            // do something
            e.printStackTrace();
        }
        return lines;
    }
    public static void main(String[] args) {
        List l = readFileInList("test.txt");

        Iterator<String> itr = l.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}

// Java Program to illustrate
// reading from text file
// as string in Java
class ReadTextAsString {

    public static String readFileAsString(String fileName)throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void main(String[] args) throws Exception {
        String data = readFileAsString("test.txt");
        System.out.println(data);
    }
}

