import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no of ticket:");
        int ticket = sc.nextInt();
        float total_cost = 0;
        float ref_cost = 0;
        if ((ticket <= 40) && (ticket >= 5)){
            
            System.out.println("Do you want refreshment:");
            char ref = sc.next().charAt(0);
            
            if (ref == 'y'){
                ref_cost = ticket*50;
            }
            
            System.out.println("Do you have coupon code:");
            char coup = sc.next().charAt(0);
            
            System.out.println("Enter the circle:");
            char circle = sc.next().charAt(0);
            
            if (circle == 'k') {
                total_cost = ticket*75;
            } else if (circle == 'q'){
                total_cost = ticket*150;
            } else {
                System.out.println("Invalid Input");
                System.exit(0);
            }
    
            if (ticket > 20) {
                total_cost *= 0.9;
            }
            
            if (coup == 'y'){
                total_cost *= 0.98;
            }
            
            total_cost += ref_cost;
            
            System.out.printf("Ticket cost:%.2f", total_cost);
        } else {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }
    }
}