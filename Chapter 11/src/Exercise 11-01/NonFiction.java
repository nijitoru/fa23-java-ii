public class NonFiction extends Book
{
    // constructor
  public NonFiction(String title){
      super(title);
      setPrice();
  }
    // setPrice()
  @Override
  public void setPrice(){
      price = 37.99;
  }
}
