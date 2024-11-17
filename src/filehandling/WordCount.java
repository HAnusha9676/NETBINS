package filehandling;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.File.*;
//import java.nio.file.Path;
//import java.nio.file.Paths;
public class WordCount {
    public static void main(String[]args)throws FileNotFoundException, IOException{
       // Path path=Paths.get("C:\\Users\\DELL\\Music\\abc.txt");
        String content=Files.readString("C:\\Users\\DELL\\Music\\abc.txt");
        String[]words=content.split("\\s+");
        System.out.println("words.length");
        int c=0;
        for(String word:words){
            if(word.equalsIgnoreCase("ratan")){
                c++;   
            } }
        System.out.println(c);
    }  
}
