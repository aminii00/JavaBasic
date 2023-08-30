package _230428_4_hashcode;

import java.util.Objects;

import _230412_1_Studentclass_exam.Student;

public class HashCodeExample {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	
	static class Student {
		int sno;
		String name;
		
		Student(int sno, String name){
			this.name = name;
			this.sno = sno;
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno,name);
		}
	}
}