package assignment.advance.qNo6;

public class Employee {
	long id;
	String name;
	String department;
	int age;
	double salary;
	public Employee(long id, String name, String department, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", age=" + age + ", salary="
				+ salary + "]";
	}
	
	
}
