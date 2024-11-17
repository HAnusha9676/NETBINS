package program;
public class AlphabetCount {
    public static void main(String[]args){
        String s="aaabbccccddaee";
       char[]arr=s.toCharArray();
        for(int i=0; i<arr.length;i++){
             boolean found=false;
             int count=1;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    found=true;
                    break;
                } }
            if(!found){
            for(int k=i+1; k<arr.length; k++){
                if(arr[i]==arr[k]){
                    count++;
                }
            }
            System.out.print(arr[i]+""+count);
            }
}     
    }    
}
// String s = "aaabbccccddaee";
//        char[] arr = s.toCharArray();
//
//        for (int i = 0; i < arr.length; i++) {
//            int count = 1; // Initialize count for each character
//            boolean found = false;
//
//            // Check if character already counted
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    found = true;
//                    break;
//                }
//            }
//
//            // Count occurrences of character
//            if (!found) {
//                for (int k = i + 1; k < arr.length; k++) {
//                    if (arr[i] == arr[k]) {
//                        count++;
//                    }
//                }
//                System.out.print(arr[i] + "" + count); // Print character and count
//            }
//        }
//    }
//}