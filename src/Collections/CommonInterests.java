
package Collections;

import java.util.HashSet;
import java.util.Set;

public class CommonInterests {
    public static void main(String[]args){
        Set<String>friend1=new HashSet<String>();
        friend1.add("reading");
        friend1.add("travelling");
        friend1.add("cooking");
        friend1.add("photography");
         Set<String>friend2=new HashSet<String>();
        friend2.add("travelling");
        friend2.add("cooking");
        friend2.add("gaming");
        friend2.add("music");
        Set<String>commn=new HashSet<String>();
        for(String friend:friend2){
       if(friend1.contains(friend)){
           commn.add(friend);
           
       }
        }
        System.out.println("common intersts:"+commn);
        
    }
    
}
