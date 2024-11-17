
package ADVJAVA;

import java.util.ArrayList;
import java.util.List;

 class Student {
    int id;
    String name;
    String course;
    Student(int id,String name,String course){
        this.id=id;
        this.name=name;
        this.course=course;
    }
      public String toString() {
        return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
      }

    void add(Students std) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public class TestFile{
          
      
    public static void main(String[]args){
        List<Student> details=new ArrayList<Student>();
        details.add(new Student(101,"anu","java"));
        details.add(new Student(102,"sathya","python"));
        Controller con=new Controller();
        con.transferController(details);
       
    
     // Save a new student
        Student newStudent = new Student(103, "John Doe", "C++");
        con.saveStudent(newStudent);
    }
}
class Controller{
   Service ser = new Service();
    
   void transferController(List<Student> details){
        ser.transferService(details);
        
    }
    void saveStudent(Student student) {
        ser.saveService(student);
    }
}
class Service{
    Repository rep=new Repository();
     void transferService(List<Student> details){
        rep.transferRepository(details);
    }
       void saveService(Student student) {
        rep.saveRepository(student);
    }
}
class Repository{
    List<Student> students = new ArrayList<>();

     void transferRepository(List<Student> details){
         for(Student data:details){
              System.out.println(data);
       }
     }
         void saveRepository(Student student) {
        students.add(student);
        System.out.println("Student saved successfully!");
    }

  
    
    
}

