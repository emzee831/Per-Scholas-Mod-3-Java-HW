package OOPConcepts;
import java.util.Scanner;

public class Starter {
	// simple interest method
	static void calculate(double years, int principle, float rate)
	{
	    double result = (principle * rate * years) /100;
		System.out.println("Your interest is : " + result + " for a loan of " + principle);
	}
	static void calculate(float num1, float num2)
	{
		System.out.println("average is : " + num1 / num2);
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// interest rate simple method call and average/ method overloading
//		calculate(0.75, 1000, 12.0f);
//		calculate(1000, 5);
		
		// Inheritance class object for employee
		
		System.out.println("Enter a employees id number, Name, age, gender and salary : ");
		
		System.out.println("enter a employee id number: ");
		int empId =  scan.nextInt(); 
		System.out.println("Enter your Name : ");
		String fName =  scan.next().trim(); 
		System.out.println("Enter your age : ");
		int age =  scan.nextInt(); 
		System.out.println("Enter your gender : ");
		char gender =  scan.next().toUpperCase().charAt(0);
		System.out.println("Enter your salary : ");
		double salary = scan.nextDouble();
		System.out.println("Enter employees yearly bounus : ");
		int bounus = scan.nextInt();
		System.out.println("Enter employees' job position : ");
		String jobPosition = scan.next();
		
		Employee emp1 =new Employee(empId, fName, age, gender, salary);
		
		emp1.display();
		System.out.println(" ");
		System.out.println("Net Salary for this employee with their added bounus of " + bounus + " is : " + emp1.calculate(bounus));
		System.out.println("This employees job poisition is " + emp1.title(jobPosition)); // second method for interface
		
//		Inheritance class object for student
		
//		System.out.println("Enter a student id number, Name, age, gender, subject 1 gpa, "
//				+ "subject 2 gpa, subject 3 gpa and finally your major : ");
//		
//		System.out.println("Enter a student id number : ");
//		int stuId = scan.nextInt(); 
//		System.out.println("Enter a Name : ");
//		String stuName = scan.next(); 
//		System.out.println("Enter a age : ");
//		int stuAge = scan.nextInt(); 
//		System.out.println("Enter gender : ");
//		char stuGen = scan.next().toUpperCase().charAt(0); 
//		System.out.println("Enter gpa for first subject : ");
//		double sub1 = scan.nextDouble(); 
//		System.out.println("Enter gpa for second subject : ");
//		double sub2 = scan.nextDouble(); 
//		System.out.println("Enter gpa for third subject : ");
//		double sub3 = scan.nextDouble();
//		System.out.println("Enter students major : ");
//		String major = scan.next();
//		System.out.println("Enter students' club that they are a part of : ");
//		String schoolClub = scan.next();
//		
//		
//		Student stu1 = new Student(stuId, stuName, stuAge, stuGen, sub1, sub2, sub3, major);
//		stu1.display();
//		double gpa1=stu1.calculate(3);
//		System.out.println("Students average GPA is : "+String.format("%.3f", gpa1));
//		System.out.println("This student is part of the schools " + stu1.title(schoolClub) + " club : "); // second method for interface	
//		
	// class build for Person1 declaring private properties
	
//	Person1 p1 = new Person1();
//	
//	System.out.println("enter your name: ");
//	p1.setPname(scan.next().trim());
//	System.out.println("enter your age: ");
//	p1.setPage(scan.nextInt());
//	System.out.println("enter your gender: ");
//	p1.setPgender(scan.next().toUpperCase().charAt(0));
//	
//	System.out.println("Name: " + p1.getPname());
//	System.out.println("Age : " + p1.getPage());
//	System.out.println("Gender : " + p1.getPgender());
//	System.out.println("Person information : " + p1.getPname() + " " + p1.getPage() + " " + p1.getPgender());
//	
	scan.close();
	}

}
