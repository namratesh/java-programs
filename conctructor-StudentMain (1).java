import java.util.Scanner;

public class StudentMain{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        Student student;
        
        System.out.println("Enter Student's Id:");
        int studentId = sc.nextInt();
        
        System.out.println("Enter Student's Name:");
        String studentName = sc.nextLine() + sc.nextLine();
        
        System.out.println("Enter Student's address:");
        String studentAddress = sc.nextLine();
        
        System.out.println("Whether the student is from NIT(Yes/No):");
        String college = sc.nextLine();
        
        while(!(college.equals("YES") || college.equals("yes") || college.equals("NO") || college.equals("no"))){
            System.out.println("Wrong Input");
            System.out.println("Whether the student is from NIT(Yes/No):");
            college = sc.nextLine();
        }
        String collegeName = "";
        if(college.equals("NO") || college.equals("no")){
            System.out.println("Enter the college name:");
            collegeName = sc.nextLine();
            student = new Student(studentId, studentName, studentAddress, collegeName);
        } else {
            student = new Student(studentId, studentName, studentAddress);
        }
        
        System.out.println("Student id:" + student.getStudentid());
        System.out.println("Student name:" + student.getStudentName());
        System.out.println("Address:" + student.getStudentAddress());
        System.out.println("College name:" + student.getCollegeName());
    }
}