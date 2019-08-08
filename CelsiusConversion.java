import java.util.*;
public class CelsiusConversion
{
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    double f;
        double c= input.nextDouble();
        f = (9*c+160)/5;
        System.out.println(f);
    }
}