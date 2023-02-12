public class Test
{
    public static void main(String[] args){
        Counter c1 = new Counter();
        c1.increase();
        c1.increase();
        c1.decrease();
        c1.increase(5);
        c1.decrease(2);
        System.out.println(c1.value());
    }
}