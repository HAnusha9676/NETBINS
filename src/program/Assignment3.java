
package program;

import java.util.ArrayList;

public class Assignment3 {
    public static void main(String[]args){
        ArrayList<String>btitles=new ArrayList<String>();
        btitles.add("HArry Potter");
        btitles.add("The Great Gatsby");
        btitles.add("moby Dick");
        btitles.add("To Kill a Mockingbird");
        btitles.add("BigLittle Lies");
        btitles.add("War and Piece");
        btitles.add("Educated");
        btitles.add("The catcher in the Roy");
       System.out.println(btitles.size());
       int index=btitles.indexOf("The Great Gatsby");
       if(index!=-1){
        btitles.set(index,"The Great Gatsby Revised");
        
    }
       System.out.println(btitles);
       btitles.remove("moby Dick");
       System.out.println(btitles);
       int index1=btitles.indexOf("moby Dick");
       System.out.println("moby Dick indx="+index1);
       System.out.println(btitles.contains("BigLittle Lies"));
    }
    
}
