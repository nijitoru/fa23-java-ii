import java.util.*;
public class Student extends Person
{
    private String major;
    private double gpa;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            super.setData();
            System.out.print("Major >> ");
            this.major = input.next();
            System.out.print("GPA >> ");
            this.gpa = input.nextDouble();
        }
    @Override
        public void display()
        {
            System.out.printf("Major: %s  GPA: %s", major, gpa);
        }
}
