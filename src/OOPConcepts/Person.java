package OOPConcepts;

public class Person {
	static int count=0;
	String pname;
	int page;
	char pgender;
	int id;
	static int idnumber=1;
	
	public Person() //non parameter class
	{
	count++;	
	this.id = idnumber++;
	}
	
	public Person(String name, int age, char gender) // class with parameters
	{
		pname=name;
		page=age;
		pgender=gender;
		count++;
		this.id = idnumber++;
	}
	
	public void display() // displaying class
	{
		System.out.println("Name : "+this.pname);
		System.out.println("Gender : "+this.pgender);
		System.out.println("Age : "+this.page);
//		System.out.println("Persons ID number is: " + this.id);
	}
	public static void totalPerson() // class to display total number of people
	{
		System.out.println("total person objets are: " + count);
	}
	
	
	
	
	
	
	
}
