public class Product
{
    private String name;
    private boolean isVegan;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setIsVegan(boolean isVegan){
        this.isVegan = isVegan;
    }

    public boolean getIsVegan(){
        return isVegan;
    }
}