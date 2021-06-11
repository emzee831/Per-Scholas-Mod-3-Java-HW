package OOPConcepts;

public class Employee extends Person implements PersonInterface {
	int emp_id;
	double emp_salary;
	
	Employee(int id, String name, int age, char gender, double salary)
	{
	super(name,age,gender);
	this.emp_id=id;
	this.emp_salary=salary;
	}
	
public void display()
{
	System.out.println(ORGANINZATION);
	System.out.println("Id : "+this.emp_id);
	super.display();
	
	System.out.println("Salary : "+this.emp_salary);
}


public double calculate(int bonus) {
	double netsalary=bonus+this.emp_salary;
	return netsalary;
}
public String title(String position) { 
	return position;
	
}
}
