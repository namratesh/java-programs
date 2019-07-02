import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter total no.of employees:");
        int noe = sc.nextInt();
        
        if (noe > 1){
            int[] age = new int[noe];
            System.out.println("Enter the age for " + noe + " employees:");
            for (int i = 0; i < noe; i++){
                int e_age = sc.nextInt();
                
                if(e_age >= 28 && e_age <= 40){
                    age[i] = e_age;
                } else {
                    System.out.println("Invalid age encountered!");
                    System.exit(0);
                }
            }
            
            System.out.printf("The average age is %.2f", calculateAverage(age));
        } else {
            System.out.println("Please enter a valid employee count");
        }
    }
    
    public static float calculateAverage(int[] age){
        float average = 0f;
        
        for (int i = 0; i < age.length; i++){
            average += age[i];
        }
        
        return (average/age.length);
    }
}