package CodeInFigures;

public class DemoConstructors
{
   public static void main(String[] args)
   {
      ASubClass child = new ASubClass(1500, "Mary", 5000);
      ASubClass child1 = new ASubClass(1600, "Pink", 60000);
      ASubClass child2 = new ASubClass(1700, "Ted", 70000);
      ASuperClass parent = new ASuperClass(200);
   }
}
