public class Product {

  private String name;
  private int quantity;

  public Product(String n, int q){
    name=n;
    quantity=q;
  }

  public String getName(){
    return name;
  }

  public int getQuantity(){
    return quantity;
  }

}
