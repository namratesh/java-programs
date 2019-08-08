import java.util.*;
import java.util.regex.*;
public class Palindrome{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        // String rev;
        System.out.println("Enter the word :");
        String word = input.nextLine();
        int n = word.length();
        String rev = "";
        Pattern pattern = Pattern.compile("[a-zA-Z]{1,100}");
        Matcher matcher = pattern.matcher(word);
        if(matcher.matches()){
            for(int i = n -1; i>=0; i--){
                rev = rev + word.charAt(i);
            }
            //System.out.println(rev);
            if(word.equalsIgnoreCase(rev)){
            System.out.println(word + " is a palindrome");
            }
            else{
                
            System.out.println(word + " is not a palindrome");
        }}
        else{
            System.out.println("Invalid Input");
            System.exit(0);
         }
    }
}
