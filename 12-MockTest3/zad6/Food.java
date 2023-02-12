public abstract class Food {
    private String name;
    private float price;

    public Food(String name, float price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    };

    public abstract void setPrice();
}
