
package arrays;
public class Arrays {
    public static void main(String[] args) {
       
       /* int[] arr = {55, 99, 14, 23, 15, 0,9};
    
        int last = arr[arr.length - 1];
         System.out.println(last);

        for (int i = arr.length - 2; i >= 0; i--)
        {
            if (arr[i] >= last) 
            {
                System.out.println(arr[i]);
                last = arr[i];

            }
        }*/
        int[][] arr={{7,5,2},{5,4,8},{9,2,6}};
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-2;j++){
                 sum=sum+arr[i][j];
                
            }
        }
        System.out.println(sum);
    }

    static void sort(char[] s1Array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean equals(char[] s1Array, char[] s2Array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

          
       
      
        
       
    
    

