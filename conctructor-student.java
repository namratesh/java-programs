import java.util.*;
public class Student {
	Scanner sc = new Scanner(System.in);

	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	public int getStudentid() {
		return studentId;
	}
	public void setStudentid(int studentid) {
		this.studentId = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
		
			}
		
	public String getCollegeName() {
		return collegeName;
	}
	  public Student(int studentId, String studentName, String studentAddress){
	        this.studentId = studentId;
	        this.studentName = studentName;
	        this.studentAddress = studentAddress;
	        this.collegeName = "NIT";
	    }
	    
	    public Student(int studentId, String studentName, String studentAddress, String collegeName){
	        this(studentId, studentName, studentAddress);
	        this.collegeName = collegeName;
	    }
	    }