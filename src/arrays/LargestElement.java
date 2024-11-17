
package arrays;
public class LargestElement {
    public static void main(String []args){
       int[] arr={1,2,3,4,5,6,7,9,10};
      int i=0;
      int j=arr.length-1;
      while(i<j){
          while(true){
              if(arr[i]%2==0){
                  break;
              }
              i++;
          }
          while(true){
              if(arr[j]%2!=0){
                  break;
              }
              j--;
          }
          
          
      
      if(i<j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          
      }
     
      i++;
          j--;
      }
      System.out.println("array elements:");
     for(int n:arr){
          System.out.print(n+" ");
     }
      
                   
               }
           }
       
        
    
    

