import java.util.*;
public class FirstOccurence{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        System.out.println("Enter the character to be searched:");
        System.out.println("Enter the character to replace:");
        String str = input.nextLine();
        String str_ch = input.nextLine();
        String str_re = input.nextLine();
        if(str.contains(str_ch)){
        String fin = str.replaceFirst(str_ch,str_re);
        System.out.println(fin);
        }
        else{
            System.out.println("character not found");
        }
        
        
    }
}
