import java.util.*;
public class Health extends Insurance 
{
    public Health()
    {
        super("Health");
    }
    public void setCost()
    {
        super.cost = 196;
    }
    public void display()
    {
        System.out.printf("%s costs %.1f per month", super.getType(), super.getCost());
    }
}
