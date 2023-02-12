public class Pizza extends Food implements Extra{

    private int size;

    public Pizza(String name, float price, int size){
        super(name, price);
        this.size = size;
    }

    @Override
    public void setPrice(){
        super.setPrice(this.size - 10);
    };

    public float discount(){
       if(getPrice() >= 30){
           return 5;
       }
       return 0;
    };

    public float delivery(){
        if(this.size >= 50){
            return 8;
        }
        return 6;
    };

    public float delivery(int n){
        if(this.size >= 50){
            return 8+n;
        }
        return 6+n;
    };

    public static void main(String[] args){
        System.out.println("GOOD");
    }

}
