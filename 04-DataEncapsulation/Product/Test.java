public class Test
{
    public static void main(String[] args){
        Product p1 = new Product();
        p1.setName("Melon");
        p1.setIsVegan(true);
        System.out.println("Name: "+p1.getName());
        System.out.println("Is vegan: "+p1.getIsVegan());
    }
}