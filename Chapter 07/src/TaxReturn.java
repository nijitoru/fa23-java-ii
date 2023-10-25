import java.util.*;
public class TaxReturn {
    private String ssn;
    private String last;
    private String first;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private double income;
    private char status;
    private double tax;
    private final double LOWINCOME = 20000;
    private final double HIGHINCOME = 50000;
    private final double SINGLELOW = 0.15;
    private final double SINGLEMED = 0.22;
    private final double SINGLEHIGH = 0.30;
    private final double MARRIEDLOW = 0.14;
    private final double MARRIEDMED = 0.20;
    private final double MARRIEDHIGH = 0.28;

    public TaxReturn(String socSec, String lastName,
                     String firstName, String add, String cty, String st,
                     String zip, double inc, char stat) {
        this.ssn = socSec;
        this.last = lastName;
        this.first = firstName;
        this.address = add;
        this.city = cty;
        this.state = st;
        this.zipCode = zip;
        this.income = inc;
        this.status = stat;

        // find & assign tax
        if(this.income < LOWINCOME){
            if(this.status == 'S'){
                this.tax = this.income * SINGLELOW;
            } else {
                this.tax = this.income * MARRIEDLOW;
            }
        } else if(income < HIGHINCOME){
            if(this.status == 'S'){
                this.tax = this.income * SINGLEMED;
            } else {
                this.tax = this.income * MARRIEDMED;
            }
        } else {
            if(this.status == 'S'){
                this.tax = this.income * SINGLEHIGH;
            } else {
                this.tax = this.income * MARRIEDHIGH;
            }
        }
    }

    public void display() {
        System.out.println("Taxpayer ssn: " + ssn + " " + first + " " + last + "\n" +
                           address + "\n" + city + ", " + state + " " + zipCode +
                           "\nMarital status: " + status + "\n" +
                           "Income: $" + income + "  Tax: $" + tax);
    }
}
