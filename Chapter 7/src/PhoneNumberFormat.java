import java.util.*;
public class PhoneNumberFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entry = "";
        String formatNum = "";
        float phoneNumber = 0;
        
        do{
            System.out.println("Enter an area code and phone number as a series of 10 digits\nEnter 999 to quit");
            entry = input.next();
            try{
                phoneNumber = Float.parseFloat(entry);
                if(entry.length() == 10){
                    formatNum = "(" + entry.substring(0, 3) + ") " + entry.substring(3,6) + "-" + entry.substring(6);
                    System.out.println("Formatted phone number: " + formatNum + "\n");
                } else if(phoneNumber != 999) {
                    System.out.println("Phone number must be 10 digits.\n");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input");
            }
        }
        while(phoneNumber != 999);
    }
}
