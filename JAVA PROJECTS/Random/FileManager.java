package Random;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static void createFile(String filename, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(content);
        writer.close();
    }

    public static String readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }

    public static void updateFile(String filename, String newContent) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(newContent);
        writer.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create file");
            System.out.println("2. Read file");
            System.out.println("3. Update file");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter filename: ");
                String filename = scanner.nextLine();
                System.out.print("Enter content: ");
                String content = scanner.nextLine();
                try {
                    createFile(filename, content);
                    System.out.println("File '" + filename + "' created.");
                } catch (IOException e) {
                    System.out.println("Error creating the file.");
                }
            } else if (choice.equals("2")) {
                System.out.print("Enter filename to read: ");
                String filename = scanner.nextLine();
                try {
                    String content = readFile(filename);
                    System.out.println("Content of '" + filename + "':\n" + content);
                } catch (IOException e) {
                    System.out.println("File '" + filename + "' not found.");
                }
            } else if (choice.equals("3")) {
                System.out.print("Enter filename to update: ");
                String filename = scanner.nextLine();
                try {
                    String content = readFile(filename);
                    System.out.print("Enter new content: ");
                    String newContent = scanner.nextLine();
                    updateFile(filename, newContent);
                    System.out.println("File '" + filename + "' updated.");
                } catch (IOException e) {
                    System.out.println("File '" + filename + "' not found.");
                }
            } else if (choice.equals("4")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }
}
