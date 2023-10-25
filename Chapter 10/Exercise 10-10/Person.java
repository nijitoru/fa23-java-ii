import java.util.*;
public class Person
{
    private String firstName;
    private String lastName;
    public String address;
    private String zip;
    private String phone;
    Scanner input = new Scanner(System.in);
    public void setData()
    {
        System.out.print("First name >> ");
        this.firstName = input.next();
        System.out.print("Last name >> ");
        this.lastName = input.next();
        System.out.print("Address >> ");
        this.address = input.next();
        System.out.print("Zip >> ");
        this.zip = input.next();
        System.out.print("Phone >> ");
        this.phone = input.next();
    }
    public void display()
    {
        System.out.printf("%s %s %s %s %s\n", firstName, lastName, address, zip, phone);
    }
}
