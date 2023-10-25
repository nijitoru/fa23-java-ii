import java.util.*;
public class Faculty extends CollegeEmployee
{
    private boolean isTenured = false;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            super.setData();
            this.isTenured = isTenured;
        }
    @Override
        public void display()
        {
            super.display();
            if(!isTenured)
                System.out.println("\nFaculty member is not tenured");
            else
                System.out.println("\nFaculty member is tenured");
        }
}
