

import java.util.Scanner;
import java.util.*;
public class ReplaceWord{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = input.nextLine();
        
        System.out.println("Enter the word to be searched:");
        String str_ch = input.nextLine();
        
        System.out.println("Enter the word to be replace:");
        String str_re = input.nextLine();
        
        if(str.contains(str_ch)){
        String fin = str.replace(str_ch,str_re);
        System.out.println(fin);
        }
        else{
            System.out.println("The word " + str_ch + " not found");
        }
        
        
    }
}
