import java.util.*;
public class FindFactor
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = input.nextInt();
        int i;
        if(n==0){
            System.out.println("No Factors");
        }
        else if(n<0){
            n = -(n);
            for(i=1;i<=n;i++)
            {if(n%i==0)
            System.out.printf(i + ",");
        }
    }
    else{
        for(i=1;i<=n;i++){
            if(n%i==0){
                System.out.printf(i+ ","); 
            }
        }
    }
}  
}