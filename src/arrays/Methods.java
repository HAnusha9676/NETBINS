
package arrays;

public class Methods {
    public static void main(String[]args){
     
     int[] arr={5,1,7,3,4,8,6,2,9,4,2,6,8,8};
     for(int i=0;i<arr.length-1;i++){
         boolean found=false;
         for(int k=i-1;k>=0;k--){
             if(arr[i]+arr[k]==10){
                 found=true;
                 break;
             }
         }
         if(!found){
             for(int j=i+1;j<arr.length-1;j++){
                 if(arr[i]+arr[j]==10){
                     System.out.println(arr[i]+","+arr[j]);
                     break;
                 }
             }
         }
       }
       }
    }
    

