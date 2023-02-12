public class Rectangle
{
    int x;
    int y;

    Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int calculatePerimeters(){
        return (2*x) + (2*y);
    }

    public int calculacteArea(){
        return x*y;
    }

    public void displayInfo(){
        System.out.println("Dimension: "+this.x+"x"+this.y );
        System.out.println("Perimeters: "+calculatePerimeters());
        System.out.println("Surface area: "+calculacteArea());
        System.out.println();
    }

    public static void main(String[] args){
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(2, 7);
        r1.displayInfo();
        r2.displayInfo();
    }
}