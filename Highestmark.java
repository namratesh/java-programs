import java.util.*;
public class Highestmark {
    
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
     
       
        int marks[] = new int[6];
        int max  = marks[0];
        for (int i=0; i<6; i++)
        {
        marks[i] = input.nextInt();
            if(marks[i] <0){
                System.out.println("Invalid mark");
                System.exit(0);
                
            }
        }
        
        
        for (int i = 0; i<6; i++){
            
        if (marks[i]>max){
        max = marks[i];
            
        }
            
        }
            System.out.println("Highest mark is " +max);
        
    }
}