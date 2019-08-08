import java.util.*;
public class SnacksDetails {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[]args)
    
    {
        System.out.println("Enter the no of pizzas bought:");
        System.out.println("Enter the no of puffs bought:");
        System.out.println("Enter the no of cool drinks bought:");
        
        int pizza = input.nextInt();
        int puff = input.nextInt();
        int drink = input.nextInt();
        
        int pizzas = pizza*100;
        int puffs = puff*20;
        int cooldrink = drink*10;
        int Tprice = pizzas + puffs + cooldrink;
        
        
        System.out.println("Bill Details");
        System.out.println("No of pizzas:" + pizza);
        System.out.println("No of puffs:" + puff);
        System.out.println("No of cooldrinks:" + drink);
        System.out.println("Total price="  + Tprice);
        System.out.println("ENJOY THE SHOW!!!");
        
    }
}