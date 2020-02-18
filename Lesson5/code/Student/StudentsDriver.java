import java.util.Arrays;
import java.util.Scanner;
public class StudentsDriver{
	public void loadStudents(Students[] obj){
		/* add logic here */
		for(int i = 0; i < obj.length; i++){
			obj[i] = new Students();
			obj[i].setStudentID(i+1);
			obj[i].setStudentGPA(4*i/5);
			obj[i].setStudentName("S" + i);
		}
	}
	public void displayStudents(Students[] obj){
		for(int i = 0; i < obj.length; i++){
			System.out.println(obj[i].getStudentID() + "\t" +
													obj[i].getStudentGPA() + "\t" +
													obj[i].getStudentName() + "\t");
		}
		/* add logic here */
	}
}
