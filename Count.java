import java.util.*;
import java.util.regex.*;
public class Count{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        
        String name = input.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z- ]{1,100}");
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()){
            int k = name.length();
            System.out.println(name + " has " + k + " characters");
            
        }
        else{
            System.out.println("Invalid input");
            
        }
        
        
    }
        
    }
