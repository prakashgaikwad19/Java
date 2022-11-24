package assignment.advance.qNo6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee(7, "a", "dg", 45, 75000);
		Employee e2 = new Employee(6, "b", "df", 43, 70000);
		Employee e3 = new Employee(5, "c", "de", 41, 65000);
		Employee e4 = new Employee(4, "d", "dd", 39, 60000);
		Employee e5 = new Employee(3, "e", "dc", 37, 55000);
		Employee e6 = new Employee(2, "f", "db", 35, 50000);
		Employee e7 = new Employee(1, "g", "da", 33, 45000);
		
		List<Employee> employeeList = new ArrayList<Employee>();
		addToList(employeeList,e1,e2,e3,e4,e5,e6,e7);

		Collections.sort(employeeList, new SortEmpBy());
		
		for(Employee e:employeeList) {
			System.out.println(e);
		}
	}

	private static void addToList(List<Employee> employeeList, Employee e1, Employee e2, Employee e3, Employee e4,
			Employee e5, Employee e6, Employee e7) {
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
		employeeList.add(e7);
	}

}
