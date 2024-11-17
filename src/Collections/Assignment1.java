
package Collections;

import java.util.ArrayList;

public class Assignment1 {
    public static void main(String[]args){
        ArrayList<String>names=new ArrayList<String>();
        names.add("google");
        names.add("micro services");
        names.add("tcs");
        names.add("sathya");
        names.add("infosis");
        names.add("amazon");
        System.err.println("size of lists -"+names.size());
        String first=names.get(0);
        System.out.println("first element -"+first);
        String last=names.get(names.size()-1);
        System.out.println("last element -"+last);
        for(int i=0;i<=2;i++){
            String name=names.get(i);
            System.out.println(name);
        }
        for(String name:names){
            System.out.println("names- "+name);
        }
        
        
    }
    
}
