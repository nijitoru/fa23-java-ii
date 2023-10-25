public class Pizza
{
   private String description;
   private double price;

   public Pizza(String desc, double price){
       this.description = desc;
       this.price = price;
   }

   public void display(){
       System.out.printf("%s pizza   Price: $%.2f", description, price);
       //System.out.println(desc + " pizza   Price: $" + price);
   }
}
