 import java.util.*;
 import java.util.regex.*;
 public class PanCard{
     public static void main(String[] arg){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the PAN no:");
         String panNo = input.nextLine();
         
        Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
         Matcher matcher = pattern.matcher(panNo);
         if(matcher.matches()){
             System.out.println("Valid PAN no");
         }
         else{
             System.out.println("Invalid PAN no" );
         }
         
         
     }
 }