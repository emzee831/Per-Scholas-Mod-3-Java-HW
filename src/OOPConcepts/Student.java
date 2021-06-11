package OOPConcepts;

public class Student extends Person implements PersonInterface {
	int stud_id;
	double subject1;
	double subject2;
	double subject3;
	String major;
	
	
	Student(int idStu, String name, int age, char gender,  double sub1, double sub2, double sub3, String maj) 
	{
	super(name,age,gender);
	this.stud_id=idStu;
	this.subject1=sub1;
	this.subject2=sub2;
	this.subject3=sub3;
	this.major=maj;
	}
	
public void display()
{
	System.out.println(ORGANINZATION);
	super.display();
	System.out.println("Student id: "+this.stud_id);
	System.out.println("Subject 1 Score: "+this.subject1);
	System.out.println("Subject 2 Score: "+this.subject2);
	System.out.println("Subject 3 Score: "+this.subject3);
	System.out.println("Students Major: "+this.major);
}


public double calculate(int totalSubjects) {
	double gpa = ((this.subject1+this.subject2+this.subject3)/totalSubjects);
	return gpa;
}
public String title(String club) { 
	return club;
	
}
	
}
