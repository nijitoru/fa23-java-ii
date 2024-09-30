import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee[] emp = new Employee[3];
		Employee[] emp1 = {new Employee(1500, 560000), new Employee(1500, 560000), new Employee(1500, 560000), new Employee(1500, 560000)};
		
//		emp[0] = new Employee(1001, 100000);
//		emp[1] = new Employee(1002, 20000);
//		emp[2] = new Employee(1003, 30000);
//		
//		int count = 0;
//		
//		for(Employee obj : emp) {
//			System.out.println("Employee " + (count + 1));
//			System.out.println("ID:" + obj.getEmpNum());
//			System.out.println("Salary:" + obj.getEmpSal());
//			count++;
//			System.out.println();
//		}
		Scanner input = new Scanner(System.in);
		int id = 0;
		double salary = 0.0;
		
		for (int i = 0; i < emp1.length; i++) {
			System.out.println("Employee " + (i + 1));
			System.out.println("ID:" + emp1[i].getEmpNum());
			System.out.println("Salary:" + emp1[i].getEmpSal());
		}
		
		for (int i = 0; i < emp.length; i++) {
			System.out.println("Enter ID for employee " + (i + 1) + ": ");
			id = input.nextInt();
			System.out.println("Enter salary for employee " + (i + 1) + ": ");
			salary = input.nextDouble();
			
			emp[i] = new Employee(id, salary);
		}
		
		for(int i = 0; i < emp.length; i++) {
			System.out.println("Employee " + (i + 1));
			System.out.println("ID:" + emp[i].getEmpNum());
			System.out.println("Salary:" + emp[i].getEmpSal());
			System.out.println();
		}
	}

}
