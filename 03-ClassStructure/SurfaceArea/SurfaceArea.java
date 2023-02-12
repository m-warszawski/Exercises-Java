public class SurfaceArea
{
    public static double CircleArea(int r)
    {
        return 3.1415*(r*r);
    }
    
    public static double TriangleArea(int a, int h)
    {
        return (a*h)/2;
    }
    
    public static double  RectangleArea(int a, int b)
    {
        return a*b;
    }
    
     public static void main(String[] args) {
        double AreaRectangle = RectangleArea(4,5);
        double AreaCircle = CircleArea(3);
        double AreaTriangle = TriangleArea(3,4);
        
        System.out.println(AreaRectangle);
        System.out.println(AreaCircle);
        System.out.println(AreaTriangle);
    }
}
