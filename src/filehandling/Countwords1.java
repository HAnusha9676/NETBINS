
package filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Countwords1 {
    public static void main(String[]args){
        String filePath = "C:\\Users\\DELL\\Music\\abc.txt";
        int wordCount=0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
                BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\DELL\\Music\\xyz.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
               // char[] Line ={};
                writer.write(line);
                
                    writer.newLine();
                }
                 //System.out.print(reader.read());
                // System.out.println(reader.readLine());
                String[] words = line.split("\\s+");
               // wordCount++;
                wordCount += words.length;
            }
         catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Number of words: " + wordCount);
       
    }
}


    



        
    
    

