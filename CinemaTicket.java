import java.util.*;
public class CinemaTicket
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    { 
    	double totalCost=1;
    	int refresh; 
    	double couponCost;
    	double discount = 0;
        System.out.println("Enter the no of ticket:");
        int ticket = input.nextInt();
        if(ticket<5 || ticket>40){
        	System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        	System.exit(0);
        }
        
        System.out.println("Do you want refreshment:");
        char refreshment = input.next().charAt(0);
        if(refreshment == 'y'){
        	 refresh = 50*ticket;
        	}
        else{
        	 refresh = 0;
        		}
        
        System.out.println("Do you have coupon code:");
        char coupon = input.next().charAt(0);
       
        System.out.println("Enter the circle:");
        char circle = input.next().charAt(0);
        
        
        if (circle == 'k' || circle == 'q'){
        	if(circle=='k'){
        		totalCost = ticket*75;
        	}
        	else if (circle=='q'){
        		totalCost = ticket*150;
        	}
        	  	
        }
        else{   
        	System.out.println("Invalid Input");
        	System.exit(0);}
         
        
        if(coupon=='y'){
        	couponCost = 0.02*totalCost;      	
        	
        }
        else{
        	couponCost = 0;
        }
        if(ticket>21){
        	discount = totalCost*0.10;
    		
    	}
        System.out.println(totalCost + " " + refresh+ " " + discount + " " + couponCost);
        double finalcost = totalCost+refresh-(discount+couponCost);
        
        System.out.println(finalcost);
        
        
        }
        
        
    }
