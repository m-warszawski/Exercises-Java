public class Counter
{
    private int lp;

    public Counter(){
        lp=0;
    }

    public void increase(){
        this.lp++;
    }

    public void decrease(){
        this.lp--;
    }

    public void increase(int n){
        this.lp += n;
    }

    public void decrease(int n){
        this.lp -= n;
    }

    public int value(){
        return lp;
    }

}