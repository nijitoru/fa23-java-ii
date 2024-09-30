public class BookArray
{
  public static void main(String[] args)
  {
     Book someBooks[] = new Book[10];
     int x;
     someBooks[0] = new Fiction("Scarlet Letter");
     someBooks[1] = new NonFiction("Introduction to Java");
     someBooks[2] = new Fiction("Mill on the Floss");
     someBooks[3] = new NonFiction("The Road Not Taken");
     someBooks[4] = new Fiction("A Tale of Two Cities");
     someBooks[5] = new NonFiction("Europe on $5 a Day");
     someBooks[6] = new Fiction("War and Peace");
     someBooks[7] = new Fiction("A Simple Plan");
     someBooks[8] = new Fiction("Disclosure");
     someBooks[9] = new Fiction("Nancy Drew");
     for(x = 0; x < someBooks.length; ++x)
        System.out.println("Book: " + 
          someBooks[x].getTitle() + " costs $" +
          someBooks[x].getPrice());
  }
}
