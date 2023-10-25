import java.util.*;
public class PrepareTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ssn = getValidSSN(input);

        System.out.print("Enter your first name: ");
        String first = input.nextLine();

        System.out.print("Enter your last name: ");
        String last = input.nextLine();

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.print("Enter your city: ");
        String city = input.nextLine();

        System.out.print("Enter your state: ");
        String state = input.nextLine();
        
        // placement matters, ask what it wants not you :(
        String zip = getValidZip(input);
        char status = getValidMaritalStatus(input);
        double income = getValidAnnualIncome(input);

        TaxReturn tReturn = new TaxReturn(ssn, last, first, address, city, state, zip, income, status);
        tReturn.display();
    }

    static String getValidSSN(Scanner input){
        System.out.print("Enter your social security number: ");
        String ssn = input.nextLine();

        boolean valid = true;

        if(ssn.length() == 11){
            for(int i = 0; i < ssn.length(); i++){
                // invalid ssn
                if(i == 3 || i == 6){
                    if(ssn.charAt(i) != '-'){
                        valid = false;
                        break;
                    }
                } else if(!Character.isDigit(ssn.charAt(i))){
                    valid = false;
                    break;
                }
            } 
        } else {
            valid = false;
            }
        // valid ssn
        if(valid){
            return ssn;
        } else {
            System.out.println("Invalid SSN. Please enter a valid SSN.");
            return getValidSSN(input);
        }
    }

    static String getValidZip(Scanner input){
        System.out.print("Enter zip code: ");
        String zip = input.nextLine();
        boolean valid = true;

        if(zip.length() == 5){
            for(int i = 0; i < zip.length(); i++){
                if(!Character.isDigit(zip.charAt(i))){
                    valid = false;
                    break;
                }
            }
        } else {
            valid = false;
        }

        if(valid){
            return zip;
        } else {
            System.out.println("Invalid zip code. Please try again.");
            return getValidZip(input);
        }
    }

    static char getValidMaritalStatus(Scanner input){
        System.out.print("Enter your martial status with 's' or 'm': ");
        String status = input.nextLine().toUpperCase();

        if(status.length() > 0 && (status.charAt(0) == 'S'|| status.charAt(0) == 'M')){
            return status.charAt(0);
        } else {
            System.out.println("Invalid marital status. Please try again.");
            return getValidMaritalStatus(input);
        }
    }

    static double getValidAnnualIncome(Scanner input){
        System.out.print("Enter your annual income: $");
        double income = Double.parseDouble(input.nextLine());

        if(income >= 0){
            return income;
        } else {
            System.out.println("Invalid input. Please try again.");
            return getValidAnnualIncome(input);
        }
    }

}
