
package ADVJAVA;

import java.util.ArrayList;

 class Students {
    int id;
    String name;
    String course;
    Students(int id,String name,String course){
        this.id=id;
        this.name=name;
        this.course=course;
    }
      public String toString() {
        return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
      }
}
public class Testfile2{
    public static void main(String[]args){
       
        Controllers con=new Controllers();
         Students std=new Students(101,"anu","java");
        con.transController(std);   
        
         Students newStudent = new Students(103, "John Doe", "C++");
        con.saveStudent(newStudent);
    }
  
    
}
class Controllers{
    Services ser = new Services();
    
   void transController(Students std){
        ser.transServices(std);
        
    }
     void saveStudent(Students std) {
        ser.saveService(std);
    }

   
    
}
class Services{
    Repositories rep=new Repositories();
     void transServices(Students std){
        rep.transRepository(std);
    }
       void saveService(Students std) {
        rep.saveRepository(std);
    }
    
}
class Repositories{
    ArrayList<Students> newstd = new ArrayList<>();

     void transRepository(Students std){
     
        System.out.println(std.id+","+std.name+","+std.course);
    
    
}
      void saveRepository(Students std) {
        newstd.add(std);
        System.out.println("Student saved successfully!");
    }
}