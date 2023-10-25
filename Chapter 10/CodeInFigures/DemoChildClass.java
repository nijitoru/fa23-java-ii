package unit10_datafiles.CodeInFigures;

public class DemoChildClass {
	
	public static void main(String[] args) {
		EmployeeWithTerritory[] emps = new EmployeeWithTerritory[3];
		emps[0] = new EmployeeWithTerritory();
		emps[1] = new EmployeeWithTerritory();
		emps[2] = new EmployeeWithTerritory();
		
		emps[0].setId(1001);
		emps[0].setSalary(50000);
		emps[0].setTerritory(1);;

	}
}
