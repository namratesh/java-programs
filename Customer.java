import java.util.*;

public class Customer {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {   System.out.println("Enter your name:");
        System.out.println("Enter age:");
        System.out.println("Enter gender:");
        System.out.println("Hailing from:");
        
        String name = input.nextLine();
        int age = input.nextInt();
        String gender = input.nextLine() + input.nextLine();
        String address  = input.nextLine(); 
        System.out.println("Welcome, " + name + "!");
        
        //int age = input.nextInt();
        System.out.println("Age:"+age);
        
        //String gender = input.nextLine();
        System.out.println("Gender:"+gender);
        
        //String address = input.nextLine();
        System.out.println("City:"+ address);
    }    
    
}