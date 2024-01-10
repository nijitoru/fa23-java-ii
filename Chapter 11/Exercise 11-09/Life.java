import java.util.*;
public class Life extends Insurance
{
    public Life()
    {
        super("Life");
    }
    public void setCost()
    {
        super.cost = 36;
    }
    public void display()
    {
        System.out.printf("%s costs %.1f per month", super.getType(), super.getCost());
    }
}
