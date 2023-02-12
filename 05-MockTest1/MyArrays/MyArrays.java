public class MyArrays
{

    public static int even(int[] array){
        int lp = 0;
        for(int i : array){
            if(i%2==0){
                lp++;
            }
        }
        return lp;
    }

    public static int positiveOdd(int[] array){
        int lp = 0;
        for (int i : array){
            if(i%2!=0 && i>0){
                lp++;
            }
        }
        return lp;
    }

}