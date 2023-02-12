import java.util.ArrayList;

public class ShoppingList{

    public ArrayList<Product> products;

    public ShoppingList(){
       this.products = new ArrayList<Product>();
    }

    public ShoppingList(ArrayList<Product> products){
       this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public String toString(){
        String text = "";
        for(int i=0; i<products.size(); i++){
            text += products.get(i).getName() + ", ";
        }
        return text;
    }

    public int total(){
        int sum = 0;
        for(int i=0; i<products.size(); i++){
            sum += products.get(i).getQuantity();
        }
        return sum;
    }

    public static void main(String[] args){
        Product p1 = new Product("Mleko", 10);
        Product p2 = new Product("Masło", 20);
        Product p3 = new Product("Ser", 30);

        ShoppingList sl = new ShoppingList();
        sl.addProduct(p1);
        sl.addProduct(p2);
        sl.addProduct(p3);
        System.out.println(sl.total());
        System.out.println(sl.toString());
    }

}