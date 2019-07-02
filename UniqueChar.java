//import java.util.*;
//     import java.util.regex.*;
//     public class UniqueChar{
//         public static void main(String[] args){
//             Scanner input = new Scanner(System.in);
//             System.out.println("Enter the sentence:");
//             String sen = input.nextLine();
//             Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
//            Matcher matcher = pattern.matcher(sen);
//            if(matcher.matches()){
//               System.out.println("Invalid Sentence");
//                System.exit(0);
//            }
//            
//           allunique(sen);
//            
//        }
//       private static void allunique(String sen){
//            int [] count = new int[256];
//            
//            for (int i=0; i<sen.length(); i++){
//                char ch = sen.charAt(i);
//                count[ch]++;
//                // Pattern p = Pattern.compile(0-9);
//                // Matcher m = p.m(sen.charAt(i));
//                // if(m.matches()){
//               //     System.out.println("Invalid Sentence");
//              // }
//               }
//               System.out.println("Unique characters:");
//               for(int i =0; i<sen.length(); i++){
//                   char chh =sen.charAt(i);
//                    if(count[chh] == 1){
//                        System.out.println(sen.charAt(i));
//                    }
//                
//               }
//               
//       } 
//       }