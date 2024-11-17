
package Collections;

import program.*;
import java.util.ArrayList;

public class Assignment3 {
    public static void main(String[]args){
        ArrayList<String>btitles=new ArrayList<String>();
        btitles.add("Harry Potter");
        btitles.add("The Great Gatsby");
        btitles.add("moby Dick");
        btitles.add("To Kill a Mockingbird");
        btitles.add("BigLittle Lies");
        btitles.add("War and Piece");
        btitles.add("Educated");
        btitles.add("The catcher in the Roy");
        
        //____________size of lists_________
       System.out.println("size of lists="+btitles.size());
       //____________update ________________
       int index=btitles.indexOf("The Great Gatsby");
       if(index!=-1){
        btitles.set(index,"The Great Gatsby Revised");
        
    } 
       System.out.println("updated list="+btitles);
       
       //_____________remove mOby dick_____________
       btitles.remove("moby Dick");
       System.out.println("without moby dick="+btitles);
       
       //____________index of moby Dick indx________________
       int index1=btitles.indexOf("moby Dick");
       System.out.println("moby Dick indx="+index1);
       
       //_____________CONTAINS BigLittle Lies_________________
       System.out.println(btitles.contains("BigLittle Lies"));
       
       //__________Starts with r________
       for(String btitle:btitles){
           if(btitle.startsWith("T")){
           
           System.out.println("titles start with t="+btitle);   
           }
       }
        for(String btitle:btitles){
            if(btitle.endsWith("e")){
            System.out.println("titles ends with e="+btitle);
        
            }
        }
            for(String btitle:btitles){
                if(btitle.length()>10){
                    System.out.println("title length-->10chrs ---"+btitle);
                }
                
                }
    
}
}
