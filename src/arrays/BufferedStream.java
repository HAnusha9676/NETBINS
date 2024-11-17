
package arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.File.*;
import java.nio.file.Path;
import java.nio.file.Paths;
public class BufferedStream {
    public static void main(String[] args)throws IOException{
//         try(BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\DELL\\Music\\abc.txt"));
//                 BufferedWriter writer=new BufferedWriter(new FileWriter("anu.text"))){
      Path path=Paths.get("C:\\Users\\DELL\\Music\\abc.text");
            
          String content=Files.readString(path);
          String[] words=content.split("\\s+");
          System.out.println(words.length);
            
            
     
        // File f=new File("C:\\Users\\DELL\\Music\\abc.txt");
        // System.out.println(f.exists());
         // System.out.println(f.delete());
        //  System.out.println(f.createNewFile());
       
            
            
            
            
            
            
            
            
            
            
            
//      String line;
//        int count=0;
//            while((line=reader.readLine())!=null){
//                    writer.write(line);
//                    writer.newLine();
//                   System.out.println((char)(reader.read()));
//                   System.out.println(reader.readLine());
//                   String[] words=line.split("\\s+");    
//                   count++;        
//                   
//                }
//           // System.out.println(count);
//        }
//        catch(IOException e){
//            e.printStackTrace();
//            
//        }
        
                
    }          
    
    
                
    }
       
                
                
                
                
                
                
//        try(FileWriter writer=new FileWriter("./abc.text")){
//            writer.write("heloo,world");
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
       /* try(BufferReader reader=new BufferedReader(new FileReader("abc.txt"));
                BufferWriter writer=new BufferWriter(new FileWriter("anu.text")){
            int c=0;
            while((c=reader.read())!=-1){
                    writer.write(c);
                    
                }
        }
        catch(IOException e){
            e.printStachTrace();
            
        }
               */
    
    

