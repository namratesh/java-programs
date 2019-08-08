import java.util.*;
public class Character{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the first letter:");
        System.out.println("Enter the second letter:");
        System.out.println("Enter the third letter:");
        System.out.println("Enter the fourth letter:");
        System.out.println("Enter the fifth letter:");
        System.out.println("Enter the sixth letter:");
        System.out.println("Enter the seventh letter:");
        
        
        String first = input.next();
        String second = input.next();
        String  third  = input.next();
        String fourth = input.next();
        String fifth = input.next();
        String sixth = input.next();
        String seventh = input.next();
        
         String letter = first + second + third + fourth + fifth + sixth + seventh ;
        String l = "RAINBOW";
        if (l.equals(letter)){
            System.out.println("RAINBOW");
        }
        else{
            System.out.println("The Spelling is wrong");
            
        }
        
        
    }
}