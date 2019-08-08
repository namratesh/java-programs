import java.util.*;
public class LeapYear
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the Year");
        int y = input.nextInt();
       
        if (y<999 || y>=9999){
        
            System.out.println("Invalid Year");
        }
        else if(y==1900|| y==1800 || y==2100 ||y==2300){
            System.out.println("Not a Leap Year");
            System.exit(0);
            
        }
        
        else if(y%4==0){
            System.out.println("Leap Year");
        }
        else {
        
            System.out.println("Not a Leap Year");
        }
        }
    }
