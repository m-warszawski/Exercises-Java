public class Test
{
    public static void main(String[] args){
        int[] arr1 = {-2,-6,5,8};
        int[] arr2 = {3,2,-5,4,1,-7};

        MyArrays m1 = new MyArrays();
        System.out.println(m1.even(arr1));
        System.out.println(m1.positiveOdd(arr2));
    }
}