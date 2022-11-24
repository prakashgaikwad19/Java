package assignment.core.qNo4;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeImplementation implements Employees {

	public static void main(String[] args) {
		EmployeeImplementation ei = new EmployeeImplementation();
		ei.calculateAge("1998-02-19");
		ei.printEmpDetail("P", "1998-02-19", "Management");
	}

	@Override
	public void calculateAge(String date) {
		LocalDate dob = LocalDate.parse(date);
		LocalDate currentDate = LocalDate.now();
		
		int age = Period.between(dob, currentDate).getYears();
		System.out.println("Age is "+age);
		
	}

	@Override
	public void printEmpDetail(String name, String date, String department) {
		String details = "Employee Details\n"
						+ "Name: " + name + "\n" 
						+ "D.O.B: " + date + "\n"
						+ "Department: " + department ;
		System.out.println(details);
	}

}
