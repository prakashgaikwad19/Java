package assignment.advance.qNo6;

import java.util.Comparator;

public class SortEmpBy implements Comparator<Employee>{
	
	/*@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.id- o2.id);
	}
*/	
	/*@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}*/

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.department.compareTo(o2.department);
	}
	
/*	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.age- o2.age);
	}
*/	
/*	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.salary- o2.salary);
	}
*/
}
