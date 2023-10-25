import java.util.*;
public class DemoRocks
{
   public static void main(String[] args)
   {
      Rock rocks = new Rock(123, 4.5);
      System.out.println("Sample # " + rocks.getSampleNumber() + " weighs " + rocks.getWeight());
      System.out.println("Description:   " + rocks.getDescription());
      System.out.println();

      Rock ignRock = new IgneousRock(234, 14.9);
      System.out.println("Sample # " + ignRock.getSampleNumber() + " weighs " + ignRock.getWeight());
      System.out.println("Description:   " + ignRock.getDescription());
      System.out.println();

      Rock sediRock = new SedimentaryRock(345, 18.3);
      System.out.println("Sample # " + sediRock.getSampleNumber() + " weighs " + sediRock.getWeight());
      System.out.println("Description:   " + sediRock.getDescription());
      System.out.println();

      Rock metaRock = new MetamorphicRock(456, 7.0);
      System.out.println("Sample # " + metaRock.getSampleNumber() + " weighs " + metaRock.getWeight());
      System.out.println("Description:   " + metaRock.getDescription());
      System.out.println();
   }
}
