
package filehandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Wordcounttt {
    public static void main(String[]args) throws IOException{
        //String filePath = "C:\\Users\\DELL\\Music\\abc.txt";
        int wordCount=0;
        int c=0;
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DELL\\Music\\abc.txt"))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
                
                for(String word:words){
                    if(word.equals("Ratan")){
                        c++;
                    }
                }
            }
              System.out.println("ratan's count: "+c);  
            
        }
         catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
            
        System.out.println("Number of words: " + wordCount);
       // System.out.println("Number of words: " + c);
       
    }

}

    



        
    
    

