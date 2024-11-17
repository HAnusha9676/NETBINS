
package program;
public class LongestWord {
    public static void main(String[] args){
        String s="this is the longest sentencein English";
//        String[] words=s.split(" ");
//        String longest =" ";
//       for (String word : words) {
//            if (word.length() > longest.length()) 
//            {
//                longest = word; 
//            }
//        }
//
//        System.out.println(longest);
        int count=1;
        for(int i=0;i<s.length();i++)
        {
           if( s.charAt(i)==' ')
               count++;
        }
               System.out.println(count);
        
    }

}

  