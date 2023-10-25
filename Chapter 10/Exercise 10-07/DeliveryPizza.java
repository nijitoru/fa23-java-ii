public class DeliveryPizza extends Pizza
{
   private double deliveryFee;
   private String address;

   public DeliveryPizza(String desc, double price, String address){
       super(desc, price);
       this.address = address;
       if(price > 15)
            deliveryFee = 3;
        else
            deliveryFee = 5;
   }

   public void display(){
       super.display();
       System.out.printf(" Deliver to: %s. Fee is %.2f\n", address, deliveryFee);
   }
}
