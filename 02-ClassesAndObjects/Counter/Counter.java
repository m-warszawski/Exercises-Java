public class Counter
{
    int value = 0;

    Counter(int value){
        this.value = value;
    }

    public void increaseOne(){
        this.value++;
    }

    public void increaseTen(){
        this.value+=10;
    }

    public void reduceOne(){
        this.value--;
    }

    public void reduceTen(){
        this.value-=10;
    }

    public void resetCounter(){
        this.value = 0;
    }

    public static void main(String[] args){
        Counter c1 = new Counter(23);
        Counter c2 = new Counter(-47);
    }
}