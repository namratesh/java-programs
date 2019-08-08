import java.util.Scanner;

public class Numerology{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char[][] arr = {
            {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},
            {'1','2','3','4','5','8','3','5','1','1','2','3','4','5','7','8','1','2','3','4','6','6','6','5','1','7'}
        };
        
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        
        char[] name_arr = name.toCharArray();
        
        for(int i = 0; i < name_arr.length; i++){
            if(!(Character.isLetter(name_arr[i]) && Character.isUpperCase(name_arr[i]))){
                System.out.println("Invalid name");
                System.exit(0);
            }
        }
        
        int temp = 0;
        for(int i = 0; i < name_arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(name_arr[i] == arr[0][j]){
                    temp += Character.getNumericValue(arr[1][j]);
                }
            }
        }
        
        System.out.println("Your numerology no is:"+temp);
    }
}