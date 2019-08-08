import java.util.*;
public class Gain
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Price of old scooter:");
        System.out.println("The amount spent for repair:");
        System.out.println("Sold Price:");
        
        int sct = input.nextInt();
        int repair = input.nextInt();
        int sold = input.nextInt();
        double gain;
        int total = sct + repair;
        
        if(sct<=0 || repair<0 || sold<=0){
            System.out.println("Incorrect Inputs");
        }
        else if (total>sold){
            System.out.println("Unable to calculate Gain Percentage");
        }
        
        else{
            gain = sold - total;
            gain = (gain/total)*100;
            System.out.println("Gain percentage is " + String.format("%.2f", gain));
        }
        
    }
}