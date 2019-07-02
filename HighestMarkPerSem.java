import java.util.Scanner;

public class HighestMarkPerSem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no of semester:");
        int noofsub = sc.nextInt();
        
        int[][] marks = new int[noofsub][];
        
        for (int i = 0; i < noofsub; i++){
            System.out.println("Enter no of subjects in " + (i + 1) + " semester:");
            marks[i] = new int[sc.nextInt()];
        }
        
        for (int i = 0; i < noofsub; i++){
            System.out.println("Marks obtained in semester " + (i + 1) + ":");
            for (int j = 0; j < marks[i].length; j++){
                marks[i][j] = sc.nextInt();
                if(marks[i][j] < 0 || marks[i][j] > 100){
                    System.out.println("You have entered invalid mark.");
                    System.exit(0);
                }
            }
        }
        
        int temp;
        for (int i = 0; i < noofsub; i++){
            temp = 0;
            for (int j = 0; j < marks[i].length; j++){
                if (marks[i][j] > temp){
                    temp = marks[i][j];
                }
            }
            System.out.println("Maximum mark in " + (i + 1) + " semester:" + temp);
        }
    }
}