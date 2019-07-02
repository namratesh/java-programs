import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		Scanner sc = new Scanner(System.in);
		 Ticket obj = new Ticket();
		 
		 System.out.println("Enter no  bookings:");
		 int book = sc.nextInt();
		 
		 System.out.println("Enter available tickets:");
		 obj.setAvailableTickets(sc.nextInt());
		 
		 while(book!=0){
			 
			 System.out.println("Enter the ticketid");
			 obj.setTicketid(sc.nextInt());
			 
			 System.out.println("Enter  price:");
			 obj.setPrice(sc.nextInt());
			 
			 System.out.println("Enter no tickets:");
			 int nooftickets =  sc.nextInt();
			 int x = obj.calculateTicketCost(nooftickets);
			 System.out.println("Available tickets: " + Ticket.getAvailableTickets());
			 System.out.println("Total amount: "+ x);
			 System.out.println("available tickets after bookings: " + Ticket.getAvailableTickets());
		 }
	}

}


public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0){
		Ticket.availableTickets = availableTickets;
	}}

	public int calculateTicketCost(int nooftickets){
		if(Ticket.getAvailableTickets() >= nooftickets){
			
			Ticket.setAvailableTickets(getAvailableTickets()-nooftickets);
			int tot = nooftickets*price;
			return tot;
		}
		else {
			return -1;
		}
	}

}
