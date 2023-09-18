import java.util.*;
public class ValidatePassword {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter a valid password: ");
            String password = "";
            password = input.nextLine();
            int upperFind = 0, lowerFind = 0, digitFind = 0;

            for(char c:password.toCharArray()){
                if(Character.isUpperCase(c))
                    upperFind++;
                else if(Character.isLowerCase(c)) 
                    lowerFind++;
                else if(Character.isDigit(c))
                    digitFind++;
            }

            String errorMsg = "";
            if(upperFind < 2)
                errorMsg += "\nuppercase letters";
            if(lowerFind < 3)
                errorMsg += "\nlowercase letters";
            if(digitFind < 1)
                errorMsg += "\ndigits";

            if((errorMsg.length()) > 1)
                System.out.println("The password did not have enough of the following:" + errorMsg);
            else {
                System.out.println("Valid password");
                break;
            }
        }
        while(true);
    }
}
