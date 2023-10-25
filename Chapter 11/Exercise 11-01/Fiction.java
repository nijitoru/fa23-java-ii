public class Fiction extends Book
{
    // constructor
  public Fiction(String title){
      super(title);
      setPrice();
  }
    // setPrice()
    @Override
    public void setPrice(){
        price = 24.99;
    }

}
