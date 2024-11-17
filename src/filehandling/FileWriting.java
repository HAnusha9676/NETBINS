
package filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriting {
    public static void main(String[]args) throws FileNotFoundException, IOException{
        File f=new File("C:\\Users\\DELL\\Music\\abc.txt");
      try(BufferedReader  fr = new BufferedReader(new FileReader(f));
        BufferedWriter fw=new BufferedWriter(new FileWriter("C:\\Users\\DELL\\Music\\filewrite.txt"))){
        String line;
        
        while((line=fr.readLine())!=null){
        System.out.println(line);
       fw.write(line);
       fw.newLine();
       
     
    }
    
        System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}