package Collections;

import java.util.ArrayList;

class Library{
    int lsbn;
    String bname;
    String bauthor;
    double bprice;
            
        
Library(int lsbn,String bname,String bauthor,double bprice){
this.lsbn=lsbn;
this.bname=bname;
this.bauthor=bauthor;
this.bprice=bprice;
}
public String toString(){
    return "[bno."+lsbn+", name"+bname+",author"+bauthor+",price"+bprice+"]";
}
}
public class Assignment2 {
    public static void main(String[]args){
        ArrayList<Library>books=new ArrayList<Library>();
        books.add(new Library(1001,"corejava","ratan",550));
        books.add(new Library(1002,"oops","kb",500));
        books.add(new Library(1003,"Spring boot","chandhu",300));
        books.add(new Library(1004,"Spring","anu",200));
        books.add(new Library(1005,"microservices","raju",600));
        Library firstbook=books.get(0);
        System.out.println("firstbook name"+firstbook);
         Library lastbook=books.get(books.size()-1);
        System.out.println("lastbook name"+lastbook);
         Library fourthbk=books.get(3);
        System.out.println("fourthbook name"+fourthbk);
         Library thirdbook=books.get(2);
        System.out.println("thirdbook name"+thirdbook);
        for(Library book:books){
            System.out.println(book);
        }
        
        
        
    }
    
}
