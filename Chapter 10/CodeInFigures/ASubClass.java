package CodeInFigures;

public class ASubClass extends ASuperClass
{
	private double salary;
   public ASubClass(int number, String n, double salary)
   {
	   super(number, n);
	   this.salary = salary;
      System.out.println("In subclass constructor");
      System.out.println("Salary is $" + salary);
   }
}
