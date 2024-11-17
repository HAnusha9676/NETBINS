/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class Files {
 public static void main(String[]args)throws FileNotFoundException, IOException{
        Path path=java.nio.file.Paths.get("C:\\Users\\DELL\\Music\\abc.txt");
        String content=Files.readString(path);
        String[]words=content.split("\\s+");
        System.out.println("words.length");
        int c=0;
        for(String word:words){
            if(word.equalsIgnoreCase("ratan")){
                c++;   
            } }
        System.out.println(c);
    }  
    public static String readString(Path path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
