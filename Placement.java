import java.util.*;
public class Placement
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        
        System.out.println("Enter the no of students placed in CSE:");
        System.out.println("Enter the no of students placed in ECE:");
        System.out.println("Enter the no of students placed in MECH:");
        
        int cse = input.nextInt();
        int ece = input.nextInt();
        int mech = input.nextInt();
        
        if (cse <0 || ece<0 || mech<0){
            System.out.println("Input is Invalid");
        }
        else if (cse==mech&& mech ==ece ){
        System.out.println("None of the department has got the highest placement");
        }
        
        else if (cse>mech && cse>ece){
            System.out.println("Highest Placement");
            System.out.println("CSE");
        }
        
        else if (mech>cse && mech>ece){
            System.out.println("Highest Placement");
            System.out.println("MECH");
            
        }
        
        else if (ece>mech && ece>cse){
            System.out.println("Highest Placement");
            System.out.println("ECE");
        }
        
        else if (ece==mech && ece>cse){
        System.out.println("Highest Placement");
        System.out.println("ECE");
        System.out.println("MECH");
        
        }
        else if (cse==ece && cse>mech){
        System.out.println("Highest Placement" + "\n" + "CSE" +"\n" +"ECE" );
        }
        else if (mech==cse && mech>ece){
            System.out.println("Highest Placement" + "\n" + "CSE" + "\n" + "MECH");
        }
        
    }
}
