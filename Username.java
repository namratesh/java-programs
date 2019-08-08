import java.util.*;
public class Username {
    static Scanner input = new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter the name:");
        String name = input.nextLine();
        System.out.println("Welcome " + name + ".");
    }
}