
package arrays;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[]args){
     String s1="read";
     String s2="dear";
    
     if(s1.length()==s2.length())
     {
        char[]arr1=s1.toCharArray();
        char[]arr2=s2.toCharArray();
         for(int i=0;i<arr1.length;i++){
             for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    char temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
                 if(arr2[i]>arr2[j]){
                    char temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]= temp;
                }
             }
         }
         if(Arrays.equals(arr2, arr1)){
             System.out.println("anagram");
         }else{
             System.out.println(" not an anagram");
         }
     }
     else{
         System.out.println("not an anagrams");
          }          
     
    }
}
    
                 
         
     
     
    



    


