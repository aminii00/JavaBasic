package _230419_3_people_student_exam;

public class Student extends People{

	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn);
		this.studentNo = studentNo;
	}
}