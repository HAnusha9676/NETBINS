package Collections;

import arrays.*;
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
  public void setEmpid(int empid)
          {
           this.empid=empid;
          }
  public int getEmpid(){
      return empid;
  }
   public void setEName(String eName)
          {
              this.eName=eName;
          }
  public String getEName(){
      return eName;
  }
   public void setEsalary(double eSalary)
          {
             this.eSalary=eSalary; 
          }
  public double getEsalary(){
      return eSalary;
  }
  public String toString(){
      return "Employee[id"+empid+",name"+eName+", salary "+eSalary+"]";
  }
  
}
class Arraylist{
    public static void main(String[]args){
     ArrayList<Employee> emps = new ArrayList<Employee>();

      emps.add(new Employee (1001,"ratan",50000.0)); 
      emps.add(new Employee (1002,"SATYHA",60000.0)); 
      emps.add(new Employee (1003,"kb",70000.0)); 
      emps.add(new Employee (1004,"sathya",90000.0)); 
        //_____________1--Size of lists_______________
       System.out.println("size of arraylist:"+emps.size());
       // _______________2--Read the employees data_________________
       for(Employee emp:emps){
        System.out.println(emp);
       }
       //________3--first employeee__________
      Employee fName=emps.get(0);
      System.out.println("first employee="+fName);
      
      //4________salary greaterthan 70000___________
      for(Employee emp:emps){
          if(emp.getEsalary()>70000){
              System.out.println("salary greaterthan 70000_"+emp);
          }
      }
      //___________5--print employee details id-1003_______
      for(Employee emp:emps){
          if(emp.getEmpid()==1003){
              System.out.println("employee id=1003 :"+emp);
          }
      }
      //____________6--Employee name start with r______________
      for(Employee emp:emps){
        if(emp.getEName().startsWith("r")){
            System.out.println("Start with r :"+emp);
            
        }
    }
      
      //______7--remove emp id=1002___________
       for(Employee emp:emps){
           if(emp.getEmpid()==1002){
               emps.remove(emp);
               break;
           }
       }
       
       //___________8--Total salary____________
        System.out.println("withoui id=1002 :"+emps);
        double salary=0;
         for(Employee emp:emps){
            salary+=emp.getEsalary();
         }
         System.out.println("total salary :"+salary);
         
         //____________9--update emp details____________
          for(Employee emp:emps){
              if(emp.getEmpid()==1001){
              emp.setEName("ratan sir");
              emp.setEsalary(23455.5);
          }
          }
          System.out.println("updataed data:"+emps);
          
          //_______10--Increase all salaries 10%________________
           for(Employee emp:emps){
              emp.setEsalary(emp.getEsalary()+emp.getEsalary()*0.1);
           }
           System.out.println("increment salary by 10%:"+emps);
           
           //-________________11-highest paid employee_____________
           Employee highPemp=emps.get(0);
            for(Employee emp:emps){
                if(emp.getEsalary()>highPemp.getEsalary()){
                    highPemp=emp;
                }
            }
            System.out.println("highest paid employee:"+highPemp);
            
            //-________________12-lowest paid employee_____________
           Employee lowPemp=emps.get(0);
            for(Employee emp:emps){
                if(emp.getEsalary()<lowPemp.getEsalary()){
                    lowPemp=emp;
                }
            }
            System.out.println("lowest paid employee:"+lowPemp);
            
            //______________12__salaries within the range____________________
            
           
            for(Employee emp:emps){
                if(emp.getEsalary()>=70000&&emp.getEsalary()<=90000){
                  System.out.println("salaries within the range__"+emp); 
                }
            }
            
            //___________13--Average of all salaries___________
            int avg=0;
            int sum=0;
            for(Employee emp:emps){
                sum+=emp.getEsalary();
            }
            avg=sum/emps.size();
            System.out.println("Average of all salaries:"+avg);
            
            
            //________________14 to store all aemployees in new list___________
            ArrayList<Employee>nemps=new ArrayList<Employee>();
            
                nemps.addAll(emps);
                for(Employee nemp:nemps){
                    System.out.println("new list:"+nemp);
                
            }



    }
    
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
