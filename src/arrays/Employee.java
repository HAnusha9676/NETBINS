package arrays;

import java.util.ArrayList;

public class Employee {
    private int empid;
     private String eName;
     private double eSalary; 
  Employee(int empid,String eName,double eSalary){
        this.empid=empid;
        this.eSalary=eSalary;
        this.eName=eName;
    }
  public String toString( int empid,String eName,double eSalary){
      return "data[id"+empid+",name"+eName+", salary "+eSalary+"]";
  }
  
}
class Arraylist{
    public static void main(String[]args){
     ArrayList<Employee> emps = new ArrayList<Employee>();

      emps.add(new Employee (1001,"ratan",50000.0)); 
      emps.add(new Employee (1002,"ratam",60000.0)); 
      emps.add(new Employee (1003,"rohan",70000.0)); 
      emps.add(new Employee (1004,"raman",90000.0)); 
        
       System.out.println(emps.size());
       for(Employee emp:emps){
       } System.out.println(emps+"\n");
      Employee fName=emps.get(0);
      System.out.println("first employee="+fName);
    }
    
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
