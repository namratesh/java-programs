import java.util.*;
import java.util.regex.*;
public class OccurenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count =0;
		
		System.out.println("Enter a word:");
		String str = sc.nextLine();
		 for (int i = 0; i < str.length(); i++){
             if(!(Character.isLetter(str.charAt(i)))){
            	 System.out.println("Not a valid string");
                 System.exit(0); 
             }
		 }
		
		System.out.println("Enter the character:");
		char ch =  sc.next().charAt(0);
		//System.out.println(ch);
		if(!(Character.isLetter(ch))){
			System.out.println("Given character is not an alphabet");
			System.exit(0);
		}
		
		 for (int i = 0; i < str.length(); i++){
			 if(str.charAt(i)== ch){
				 //System.out.println(ch);
				 count++;
				 
			 }
			 	 
		 }
		 if(count==0){
			 System.out.println("The given character \'" + ch+ "\' not present in the given word.");
			 
		 }
		 else{
		 System.out.println("No of \'" + ch + "\' present in the given word is "+count);
		 }
		 
	}

}
