import java.util.*;
public class Season
{
    static Scanner input = new Scanner(System.in); 
    public static void main(String[] args)
    
    {
        
        System.out.println("Enter the month:");
        
        int n = input.nextInt();
        
        if(n==3 || n==4 || n==5){
            System.out.println("Season:Spring");
        }
        else if (n == 6 || n == 7 || n==8){
            System.out.println("Season:Summer");
        }
        
        else if (n==9 || n==10 || n==11){
        
            System.out.println("Season:Autumn");
        }
        else if (n==12 || n==1 || n==2){
            System.out.println("Season:Winter");
        }
        
        else
        {
            System.out.println("Invalid month");
        }
        
        
        
    }
}