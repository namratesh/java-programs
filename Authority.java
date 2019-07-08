import java.util.Scanner;
import java.util.regex.*;
public class Authority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inmate's name:");
		String name = sc.nextLine();
		System.out.println("Inmate's father's name:");
		String fname = sc.nextLine();
		Pattern pattern = Pattern.compile("[a-zA-Z- ]{1,100}");
		 Matcher matcher = pattern.matcher(name);
		 Matcher matcher1 = pattern.matcher(fname);
	        if(matcher.matches()){
	        	if(matcher1.matches()){
	        	name = name.toUpperCase();
	    		fname = fname.toUpperCase();
	    		System.out.println(name + " "+fname);	
	        }
	        
	        else{
	        	System.out.println("Invalid name");
	            System.exit(0);
	        }  
	        }	
	        else{
	 	        	System.out.println("Invalid name");
	 	            System.exit(0);
	 	        }
}
}