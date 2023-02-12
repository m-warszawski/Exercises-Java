public class Rectangle extends Shape {
    
    private double x;
    private double y;

    public Rectangle(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double area(){
        return x*y;
    };

    public double perimeter(){
      return 2*x + 2*y;
    };


}
