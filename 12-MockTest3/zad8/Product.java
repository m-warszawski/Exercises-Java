public class Product implements Comparable{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public static void main(String[] args){
        Product p1 = new Product("Mleko", 10);
        Product p2 = new Product("Pieprz", 45);
        Product p3 = new Product("Chleb", 30);
        Product[] products = {p1, p2, p3};
        Comparable.sort(products);
    }

}
