import java.util.*;
class mb
{
   public static void main(String[] args)
   {
      double[][] bonuses =
        { 
            { 5, 9, 16, 22, 30},
            {10, 12, 18, 24, 36},
            {20, 25, 32, 42, 53},
            {32, 38, 45, 55, 68},
            {46, 54, 65, 77, 90},
            {60, 72, 84, 96, 120},
            {85, 100, 120, 140, 175}
        };
      double bonus = 0.0;
      Scanner input = new Scanner(System.in);
      while(true){
          System.out.print("Enter number of full weeks worke or 99 to quit >> ");
          int weeks = input.nextInt();
          System.out.print("Enter number of positive reviews received >> ");
          int reviews = input.nextInt();
          if(weeks == 99)
            break;
          if(reviews == 99)
            break;
          if(weeks > 6)
            weeks = 6;
          if(reviews > 4)
            reviews = 4;
         
          bonus+=bonuses[weeks][reviews];
          System.out.print("Bonus for " + weeks + " weeks and " + reviews + " positive reviews is " + bonus);
      }
        
   }
}
   
