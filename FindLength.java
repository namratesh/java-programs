import java.util.*;


public class FindLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		

//			
			
			 for (int i = 0; i < str.length(); i++){
				                if(!(Character.isLetter(str.charAt(i)) || str.charAt(i) == ' ')){
				                    System.out.println("Invalid String");
				                    System.exit(0); 
				                }
				               }
		
			 System.out.println("No of characters is:"+str.length());
			
		
		
	}

	
	}
