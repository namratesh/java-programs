import java.util.*;

public class NumToMonth
 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    
    {
        int n = input.nextInt();
        String mon;
        
        switch(n){
            case 1 :
                mon = "January";
                break;
                
            case 2:
                mon = "February";
                break;
            case 3:
                mon ="March";
                break;
            case 4:
                mon = "April";
                break;
            case 5:
                mon = "May";
                break;
            
            case 6:
                mon = "June";
                break;
                
            case 7:
                mon = "July";
                
            case 8:
                mon = "August";
                break;
            case 9:
                mon = "September";
                break;
            case 10:
                mon = "October";
                break;
            case 11:
                mon = "November";
               
                break;
             case 12:
                mon = "December";
                break;
            default:
            mon = "No month for the number " + n;
            break;
            
                
        }
        System.out.println(mon);
        
       
    }
        
        }
        
    
 