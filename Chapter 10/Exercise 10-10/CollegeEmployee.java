import java.util.*;
public class CollegeEmployee extends Person
{   
    private String ssn;
    private double annualSalary;
    private String dept;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            super.setData();
            System.out.print("SSN >> ");
            this.ssn = input.next();
            System.out.print("Salary >> ");
            this.annualSalary = input.nextDouble();
            System.out.print("Department >> ");
            this.dept = input.next();
        }
    @Override
        public void display()
        {
            super.display();
            System.out.printf("SSN: %s Salary $%.1f Department: %s", ssn, annualSalary, dept);
        }
}
