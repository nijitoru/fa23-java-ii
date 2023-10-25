public class DemoPizzas 
{
   public static void main(String args[])
   {
      Pizza pizza = new Pizza("sausage and onion", 14.99);
      DeliveryPizza deliPizza = new DeliveryPizza("sausage and onion", 14.99, "Main Street");

      pizza.display();
      System.out.println("\n");
   }
}
