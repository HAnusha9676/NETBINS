
package filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileMerging {
     public static void main(String[] args) {
          String file1 = "C:\\Users\\DELL\\Music\\file1.txt";
        String file2 = "C:\\Users\\DELL\\Music\\file2.txt";
        String file3 = "C:\\Users\\DELL\\Music\\file3.txt";
        String outputFile = "C:\\Users\\DELL\\Music\\mergeFile.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String[] files = {file1, file2, file3};
            for (String file : files) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Error reading file: " + file);
                }
            }
            System.out.println("Files merged successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to output file: " + e.getMessage());
        }

     }
}
       
           
