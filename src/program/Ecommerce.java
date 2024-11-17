//*****************    ASSIGNMENT=5     *******************
package program;

import java.util.ArrayList;
 class Example {
    public static void main(String[]args){
        ArrayList<Ecommerce >products=new ArrayList<Ecommerce>();
        products.add(new Ecommerce(101,"laptop",12000.0,120));
        products.add(new Ecommerce(102,"Mobile",7000.0,78));
        products.add(new Ecommerce(103,"Tab",22000.0,90));
        products.add(new Ecommerce(104,"Speakers",2500.0,90));
        products.add(new Ecommerce(105,"TV",11000.0,344));
        //size of lists
        System.out.println("size of lists="+products.size());
        //read all products detatils
        for(Ecommerce prod:products){
         System.out.println(prod);
        }
        //update the prduct price pname=tv
        for(Ecommerce prod:products){
            if(prod.getPname=="Tv"){
                prod.setProPrice(20000);
                
            }
            System.out.println(prod);
        }       
        //serach Speakers present or not
        System.out.println(products.contains("Speakers"));
        
        //Expensiveproduct cost>10k
        ArrayList<Ecommerce>expProd=new ArrayList<Ecommerce>();
        for(Ecommerce prod:products){
            if(prod.getProPrice()>10000){
              expProd.add(prod);
              
            }
        }
        System.out.println(expProd);
    
        //Product strt with "T";
         for(Ecommerce prod:products){
             if(prod.getPname().startsWith("T")){
         
         System.out.println("Starts with t="+prod);
         }
    }
    

    //Expensive product in the list
    Ecommerce exp=products.get(0);
     for(Ecommerce prod:products){
         if(prod.getProPrice()>exp.getProPrice()){
             exp=prod;
         }
     }
     System.out.println("Expensive product in the list"+exp);
     //cheapest product in the list
    Ecommerce cheap=products.get(0);
     for(Ecommerce prod:products){
         if(prod.getProPrice()<cheap.getProPrice()){
             cheap=prod;
         }
     }
     System.out.println("cheapest product in the list"+cheap);
    
    
   //update laptop quantity with 500
     for(Ecommerce prod:products){
         if(prod.getPname()=="laptop"){
            prod.setProQuantity(500);
         }
     
     System.out.println(""+prod);
     }
     //******count no.of products in store*************
     int totProd=0;
     for(Ecommerce prod:products){
         totProd+=prod.getProQuantity();
     }
     System.out.println("total priduct="+totProd);
     
     //************remove products************
     for(Ecommerce prod:products){
         if(prod.getPid()==103){
             products.remove(prod);
         
        break;
         }
     } 
     System.out.println(products.contains("Tab"));
     
     
 }  
 }
public class Ecommerce{
    int pid;
    String pname;
    double proPrice;
    int proQuantity;
    String getPname;
    int getProPrice;
     
Ecommerce(int pid,String pname, double proPrice, int proQuantity){
    this.pid=pid;
     this.pname=pname;
      this.proPrice=proPrice;
      this.proQuantity=proQuantity;
}
public String toString(){
    return "EcomProducts [id="+pid+",name="+pname+", Quantity="+proQuantity+"]";
}
public void setPid(int pid){
   this.pid=pid;
}
public int getPid(){
    return pid;
}
public void setPname( String pname){
    this.pname=pname;
}
public String getPname(){
    return pname;
}
public void setProPrice(double proPrice){
    this.proPrice=proPrice;
}
public double getProPrice(){
   return proPrice;
}
public void setProQuantity(int proQuantity){
    this.proQuantity=proQuantity;
}
public int getProQuantity(){
   return proQuantity;
}
        }
