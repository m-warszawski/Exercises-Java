public class Statistics
{
    int x;
    int y;

    Statistics(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int calculateNumberOfElements()
    {
        int num=0;
        for(int i=X; i<=Y; i++){
            num++;
        }
        return num;
    }

    public int calculateSumOfNumbers()
    {
        int sum=0;
        for(int i=X; i<=Y; i++){
            sum = sum + i;
        }
        return sum;
    }

    public double calculateArithmeticMean()
    {
        int sum = calculateSumOfNumbers();
        int num = calculateNumberOfElements();
        return sum / num;
    }

    public static void main(String[] args) {
        Statistics s1 = new Statistics(5,10);

        System.out.println("Number of elements: " + s1.calculateNumberOfElements());
        System.out.println("Sum od numbers: " + s1.calculateSumOfNumbers());
        System.out.println("Arithmetic mean od numbers: " + s1.calculateArithmeticMean());
    }
}