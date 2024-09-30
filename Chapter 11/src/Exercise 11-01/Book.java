public abstract class Book
{
   // attributes
    private String title;
    protected double price;

   // constructor
    public Book(String title){
        super();
        this.title = title;
    }
   // get and set methods
   public String getTitle(){
       return title;
   }
   public double getPrice(){
       return price;
   }

   public abstract void setPrice();
}
