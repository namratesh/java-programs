import java.util.Scanner;

public class UniqueChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the sentence:");
        String s = sc.nextLine();
        
        for (int i = 0; i < s.length(); i++){
            if(!(Character.isLetter(s.charAt(i)) || s.charAt(i) == ' ')){
                System.out.println("Invalid Sentence");
                System.exit(0);
            }
        }
        
        int count[] = new int[256];
        
        int i;
        for (i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                count[(int)s.charAt(i)]++;
            }
        }
        boolean state1 = false;
        boolean state2 = false;
        int n = i;
        for(i = 0; i < n; i++){
            if (count[(int)s.charAt(i)] == 1){
                if (!state1){
                    System.out.println("Unique characters:");
                }
                System.out.println(s.charAt(i));
                state1 = true;
                state2 = true;
            }
        }
        
        if(!state2){
            System.out.println("No unique characters");
        }
    }
}