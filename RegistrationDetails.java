import java.util.*;
public class RegistrationDetails
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter your name:");
        System.out.println("Enter your age:");
        System.out.println("Enter your phoneno:");
        System.out.println("Enter your qualification:");
        System.out.println("Enter your email id[please provide valid id, after registering your registration id will be mailed]:");
        System.out.println("Enter your noofexperience[if any]:");
        
        String name = input.nextLine();
        int age = input.nextInt();
        double phone = input.nextDouble();
        String qual = input.next();
        String email = input.next();
        double exp = input.nextDouble();
        
        System.out.println("Dear " + name + ", Thanks for registering in our portal, registration id will be mailed to " + email + " within 2 working days ");
    }
}