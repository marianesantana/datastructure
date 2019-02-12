package vector;
import java.util.Arrays;

public class Vector {
	private Student[] students = new Student[100];
	private int totalStudents = 0;
	
	public void add(Student student) {
		this.students[totalStudents] = student;
		totalStudents++;
			
	}
	
	public boolean validPosition(int position) {
		return position >= 0 && position <= totalStudents;
	}
	public void add(Student student, int position) {
		if(!validPosition(position))
			throw new IllegalArgumentException("posicao inválida"); 
		for(int i = totalStudents -1; i>= position; i-=1) {
			students[i+1] = students[i];
		}
		students[position] = student;
		totalStudents++;
	}
	private boolean takenPosition(int position) {
		return position >=0 && position<=totalStudents;
	}
	public Student take(int position) {
		if(!takenPosition(position)) {
			throw new IllegalArgumentException("posicao inválida");
		}
		return students[position];
	}
	
	public boolean contains(Student student) {
		for(int i = 0; i < totalStudents; i++) {
			if(student.equals(students[i])) {
				return true;
			}
		}
		return false;
	}
	
	public void remove(int position) {
		for(int i = position; i < this.totalStudents; i++) {
			this.students[i] = this.students[i+1];
					
		}
		totalStudents--;
		
	}
	public int length() {
		return totalStudents;
	}
	
	public String toString() {
		return Arrays.toString(students);
	}

}
