// Application lists valid shipping codes
// then prompts user for a code
// Application accepts a shipping code
// and determines if it is valid
import java.util.*;
public class DebugEight1
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      char userCode;
      String entry, message;
      boolean found = false;
      char[] okayCodes = {'A','C','T','H'};
      int length = 4;
      StringBuffer prompt = new 
            StringBuffer("Enter shipping code for this delivery\nValid codes are: ");
      for(int x = 0; x < length; x++)
      {
          prompt.append(okayCodes[x]);
          if(x != (okayCodes.length - 1))
             prompt.append(", ");     
      }
      System.out.println(prompt);
      entry = input.next();
      userCode = entry.charAt(0);
      for(int i = 0; i < length; i++)
      {
         if(userCode = okayCodes[i])
         {
            found = true;
         }
      }
      if(found)
         message = "Good code";
      else
         message = "Sorry code not found";
      System.out.println(message);
   }
}
